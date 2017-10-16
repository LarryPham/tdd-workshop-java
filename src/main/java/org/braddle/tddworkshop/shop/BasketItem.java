package org.braddle.tddworkshop.shop;

public class BasketItem {
    private final Product product;
    private final int quantity;

    public BasketItem(Product product, int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public int getPrice() {
        return product.getPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
