package org.braddle.tddworkshop.shop;

public interface Till {

    String createBasket();

    void addProduct(String BasketId, String ean, int quantity) throws ProductNotFoundException, BasketDoesNotExistException;

    void removeProduct(String BasketId, String ean, int quantity) throws ProductNotInBasketException, BasketDoesNotExistException;

    Basket getBasket(String BasketId) throws BasketDoesNotExistException;
}
