package org.braddle.tddworkshop.book;

public interface ReviewRepository {
    Review findByEAN(String ean) throws ReviewServiceDownException;
}
