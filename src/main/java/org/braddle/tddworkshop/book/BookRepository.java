package org.braddle.tddworkshop.book;

public interface BookRepository {
    Book findByISBN(String isbn) throws BookNotFoundException, BookServiceDownException;
}
