package org.braddle.tddworkshop.shop;

public class BasketItem {
    private final Product product;
    private final int quantity;

    public BasketItem(Product product, int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public int getPrice() {
        return product.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public String getEAN() {
        return product.getEan();
    }
}
