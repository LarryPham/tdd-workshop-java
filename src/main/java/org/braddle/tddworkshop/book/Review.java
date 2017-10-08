package org.braddle.tddworkshop.book;

import java.sql.Time;

public class Review {

    private int rating;

    private String comment;

    private String name;

    private Time timeCreated;

    public Review(int rating, String comment, String name, Time timeCreated) {
        this.rating = rating;
        this.comment = comment;
        this.name = name;
        this.timeCreated = timeCreated;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    public Time getTimeCreated() {
        return timeCreated;
    }
}
