package org.braddle.tddworkshop.basket;

import java.sql.Time;
import java.util.ArrayList;

public class Basket {

    private int id;

    private Time startTime;

    private Time endTime;

    private int status;

    private ArrayList<BasketItem> items;

    public Basket(int id) {
        this.id = id;
    }
}
