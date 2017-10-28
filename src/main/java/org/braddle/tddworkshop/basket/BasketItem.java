package org.braddle.tddworkshop.basket;

public class BasketItem {

    private int id;

    private String EAN;

    private String name;

    private String description;

    private int price;

    private int quantity;

    public BasketItem(int id, String EAN, String name, String description, int price) {
        this.id = id;
        this.EAN = EAN;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getEAN() {
        return EAN;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
