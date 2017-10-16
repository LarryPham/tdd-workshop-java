package org.braddle.tddworkshop.shop;

public class Product {

    private String ean;

    private String name;

    private int price;

    public Product(String ean, String name, int price) {
        this.ean = ean;
        this.name = name;
        this.price = price;
    }

    public String getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
