package org.braddle.tddworkshop.shop;

import java.util.HashMap;

public class ShopService {

    private HashMap<String, String> sessions;
    private Till till;

    public ShopService(Till till) {
        this.till = till;
        this.sessions = new HashMap<String, String>();
    }

    public ShopService(Till till, HashMap<String, String> sessions) {
        this.till = till;
        this.sessions = sessions;
    }

    public Basket createBasket(MyHttpRequest httpRequest) throws TillException {
        String basketID = this.till.createBasket();

        this.sessions.put(httpRequest.getSessionID(), basketID);

        try {
            return this.till.getBasket(basketID);
        } catch (BasketDoesNotExistException e) {
            throw new TillException("Error occurred creating basket on till");
        }
    }

    public Basket addtoBasket(MyHttpRequest request) throws Exception {
        String basketID = getBasketID(request);

        try {
            this.till.addProduct(basketID, request.getAttribute("ean"), Integer.parseInt(request.getAttribute("qty")));

            return this.till.getBasket(basketID);
        } catch (BasketDoesNotExistException e) {
            throw new TillException("Error occurred updating basket on till");
        } catch (ProductNotFoundException e) {
            throw new TillException("Could not find requested product");
        }
    }

    public Basket removeFromBasket(MyHttpRequest request) throws TillException, SessionException, Exception {
        String basketID = getBasketID(request);

        this.till.removeProduct(basketID, request.getAttribute("ean"), Integer.parseInt(request.getAttribute("qty")));

        try {
            return this.till.getBasket(basketID);
        } catch (BasketDoesNotExistException e) {
            throw new TillException("Error occurred updating basket on till");
        }
    }

    private String getBasketID(MyHttpRequest request) throws SessionException {
        if (!this.sessions.containsKey(request.getSessionID())) {
            throw new SessionException("Current session does not have a basket.");
        }

        return this.sessions.get(request.getSessionID());
    }
}
