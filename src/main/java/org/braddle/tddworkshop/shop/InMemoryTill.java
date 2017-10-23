package org.braddle.tddworkshop.shop;

import java.util.ArrayList;

public class InMemoryTill implements Till {

    public String createBasket() {
        return null;
    }

    public void addProduct(String BasketId, String ean, int quantity) throws ProductNotFoundException, BasketDoesNotExistException {

    }

    public void removeProduct(String BasketId, String ean, int quantity) throws ProductNotInBasketException, BasketDoesNotExistException {

    }

    public Basket getBasket(String BasketId) throws BasketDoesNotExistException {
        return null;
    }
}
