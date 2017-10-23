package org.braddle.tddworkshop.shop;

import java.util.ArrayList;

public class Basket {

    private ArrayList<BasketItem> basketItems;
    private String basketID;
    private double cashTotal;
    private int totalQuantity;

    public Basket(String basketID, double cashTotal, int totalQuantity) {
        this.basketID = basketID;
        this.cashTotal = cashTotal;
        this.totalQuantity = totalQuantity;
        basketItems = new ArrayList<BasketItem>();
    }

    public void addBasketItem(BasketItem basketItem) {
        basketItems.add(basketItem);
    }

    public ArrayList<BasketItem> getBasketItems() {
        return basketItems;
    }

    public String getBasketID() {
        return basketID;
    }

    public double getCashTotal() {
        return cashTotal;
    }

    public void setCashTotal(double cashTotal) {
        this.cashTotal = cashTotal;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
