package org.braddle.tddworkshop.book;

/**
 * Created by mark.bradley on 13/10/2017.
 */
public class JsonBookService implements BookService {

    private BookRepository bookRepository;

    public JsonBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBook(String isbn) {
        try {
            Book book = bookRepository.findByISBN(isbn);

            String json = "{\"isbn\":\"" + book.getIsbn() + "\"," +
                    "\"ean\":\"" + book.getEan() + "\"," +
                    "\"title\":\"" + book.getTitle() + "\"," +
                    "\"author\":\"" + book.getAuthor() + "\"," +
                    "\"price\":" + book.getPrice() + "," +
                    "\"year_published\":" + book.getYearPublished() +
                    "}";

            return json;

        } catch (BookNotFoundException e) {
            return "{\"status\":404,\"code\":1,\"title\":\"Book not found\",\"detail\":\"Could not find book with ISBN: " + isbn + "\"}";
        } catch (BookServiceDownException e) {
            return "{\"status\":500,\"code\":2,\"title\":\"Repository unavailable\",\"detail\":\"Service unavailable, try again later\"}";
        }
    }

    public String getBookWithReivews(String isbn) {
        return null;
    }
}
