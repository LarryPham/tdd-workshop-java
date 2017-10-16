package org.braddle.tddworkshop.shop;

import java.util.ArrayList;

public class Basket {

    private ArrayList<BasketItem> basketItems;

    public Basket() {
        basketItems = new ArrayList<BasketItem>();
    }

    public void add(BasketItem basketItem) {
        basketItems.add(basketItem);
    }

    public int getTotal() {
        int total = 0;

        for (BasketItem basketItem : basketItems) {
            total += basketItem.getPrice();
        }

        return total;
    }

    public boolean isEmpty() {
        return basketItems.isEmpty();
    }

    public int getNumberOfItems() {
        int total = 0;

        for (BasketItem basketItem : basketItems) {
            total += basketItem.getQuantity();
        }

        return total;
    }
}
