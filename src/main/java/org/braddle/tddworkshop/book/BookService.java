package org.braddle.tddworkshop.book;

public interface BookService {
    // Both functions eturns JSON no matter the response from the service
    String getBook(String isbn);
    String getBookWithReivews(String isbn);
}
