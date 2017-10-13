package org.braddle.tddworkshop.book;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @Test
    public void testBookServiceReturnsValidJSONWhenBookFound() throws Exception {
        String drNoJson = "{\"isbn\":\"0099576929\",\"ean\":\"1357924680\",\"title\":\"Dr No\",\"author\":\"Ian Fleming\",\"price\":3.99,\"year_published\":1993}";
        String casionRoyaleJson = "{\"isbn\":\"0230037496\",\"ean\":\"2468013579\",\"title\":\"Casino Royale\",\"author\":\"Ian Fleming\",\"price\":4.99,\"year_published\":1990}";

        Book drNo = new Book("0099576929", "1357924680", "Dr No", "Ian Fleming", 3.99, 1993);

        JsonBookService jsonBookService = new JsonBookService(mockedBookRepository);

        assertEquals(drNoJson, jsonBookService.getBook("0099576929"));
        assertEquals(casionRoyaleJson, jsonBookService.getBook("0230037496"));
    }

    @Test
    public void testBookServiceReutrnsValidJsonWhenBookNotFound() throws Exception {
        String errorMoonrakerJson = "{\"status\":404,\"code\":1,\"title\":\"Book not found\",\"detail\":\"Could not find book with ISBN: 0099576872\"}";
        String errorGoldfingerJson = "{\"status\":404,\"code\":1,\"title\":\"Book not found\",\"detail\":\"Could not find book with ISBN: 1784871095\"}";

        JsonBookService jsonBookService = new JsonBookService(mockedBookRepository);

        assertEquals(errorMoonrakerJson, jsonBookService.getBook("0099576872"));
        assertEquals(errorGoldfingerJson, jsonBookService.getBook("1784871095"));
    }

    @Test
    public void testBookServiceReturnValidJsonWhenBookRepositoryUnavaiable() throws Exception {
        String errorRepositoryJson = "{\"status\":500,\"code\":2,\"title\":\"Repository unavailable\",\"detail\":\"Service unavailable, try again later\"}";

        JsonBookService jsonBookService = new JsonBookService(mockedBookRepository);

        assertEquals(errorRepositoryJson, jsonBookService.getBook("009957702X"));
    }
}
