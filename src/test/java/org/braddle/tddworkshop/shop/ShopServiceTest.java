package org.braddle.tddworkshop.shop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.HashMap;

public class ShopServiceTest {

    private Till till;

    private final Product harryPotterGame = new Product(
            "5030930027100",
            "Harry Potter And The Philosopher Stone Sony Playstation 1 Ps1",
            1500
    );
    private final Product codAdvancedWarface = new Product(
            "5030917145810",
            "Call Of Duty Advanced Warfare Game",
            3000
    );

//    @Before
//    public void setUpShopService()
//    {
//        ArrayList<Product> products = new ArrayList<Product>() ;
//        products.add(harryPotterGame);
//        products.add(codAdvancedWarface);
//
//        till = new InMemoryTill(products);
//    }

//    @Test
//    public void testCreateShopReturnsAnEmptyBasket() throws Exception {
//        // WHEN I create a basket
//        MyHttpRequest createBasketHTTPRequest = new MyHttpRequest("123-abc-456-def", new HashMap<String, String>());
//
//        ShopService shopService = new ShopService(till);
//        Basket basket = shopService.createBasket(createBasketHTTPRequest);
//
//        // THEN I have an empty basket
//        Assert.assertEquals(0, basket.getTotalQuantity());
//        Assert.assertEquals(0.00, basket.getCashTotal(), 0.00);
//    }

//    @Test
//    public void testAddToBasketReturnsABasketAfterAddingAnItem() throws Exception{
//        // GIVEN  a basket
//        MyHttpRequest createBasketHTTPRequest = new MyHttpRequest("123-abc-456-def", new HashMap<String, String>());
//
//        ShopService shopService = new ShopService(till);
//        shopService.createBasket(createBasketHTTPRequest);
//
//        // When I add a product to my basket
//        HashMap<String, String> attributes = new HashMap<String, String>();
//        attributes.put("ean", "5030930027100");
//        attributes.put("qty", "1");
//        MyHttpRequest harryPotterGameHTTPRequest = new MyHttpRequest("123-abc-456-def", attributes);
//
//
//        Basket basket = shopService.addtoBasket(harryPotterGameHTTPRequest);
//
//        // THEN I have a basket with one item
//        Assert.assertEquals(1, basket.getTotalQuantity());
//        Assert.assertEquals(15.00, basket.getCashTotal(), 0.00);
//    }

//    @Test (expected = SessionException.class)
//    public void testAddToBasketThrowExceptionWhenAttemptingToAddToBasketWithNonexistingSession() throws Exception {
//        HashMap<String, String> attributes = new HashMap<String, String>();
//        attributes.put("ean", "5030930027100");
//        attributes.put("qty", "1");
//        MyHttpRequest harryPotterGameHTTPRequest = new MyHttpRequest("123-abc-456-def", attributes);
//
//        ShopService shopService = new ShopService(till);
//        shopService.addtoBasket(harryPotterGameHTTPRequest);
//    }

//    @Test (expected = TillException.class)
//    public void testAddToBasketThrowsExpectionIfTillDoesNotFindBasket() throws Exception {
//        HashMap<String, String> attributes = new HashMap<String, String>();
//        attributes.put("ean", "5030930027100");
//        attributes.put("qty", "1");
//        MyHttpRequest harryPotterGameHTTPRequest = new MyHttpRequest("123-abc-456-def", attributes);
//
//        HashMap<String, String>sessions = new HashMap<String, String>();
//        sessions.put("123-abc-456-def", "NOPE12");
//        ShopService shopService = new ShopService(till, sessions);
//        shopService.addtoBasket(harryPotterGameHTTPRequest);
//    }

//    @Test (expected = TillException.class)
//    public void testAddToBasketThrowsExceptionWhenAttemptingToAddProductThatDoesNotExist() throws Exception {
//        MyHttpRequest createBasketHTTPRequest = new MyHttpRequest("123-abc-456-def", new HashMap<String, String>());
//
//        ShopService shopService = new ShopService(till);
//        shopService.createBasket(createBasketHTTPRequest);
//
//        HashMap<String, String> attributes = new HashMap<String, String>();
//        attributes.put("ean", "5055277028184");
//        attributes.put("qty", "1");
//        MyHttpRequest sonicHTTPRequest = new MyHttpRequest("123-abc-456-def", attributes);
//
//        shopService.addtoBasket(sonicHTTPRequest);
//    }

//    @Test
//    public void testRemoveFromBasketReturnsBasketAfterRemovingAnItem()  throws Exception{
//        // GIVEN a basket with an item
//        MyHttpRequest createBasketHTTPRequest = new MyHttpRequest("123-abc-456-def", new HashMap<String, String>());
//
//        ShopService shopService = new ShopService(till);
//        shopService.createBasket(createBasketHTTPRequest);
//
//        HashMap<String, String> attributes = new HashMap<String, String>();
//        attributes.put("ean", "5030930027100");
//        attributes.put("qty", "1");
//        MyHttpRequest harryPotterGameHTTPRequest = new MyHttpRequest("123-abc-456-def", attributes);
//        shopService.addtoBasket(harryPotterGameHTTPRequest);
//
//        // WHEN I remove an item from my basket
//        Basket basket = shopService.removeFromBasket(harryPotterGameHTTPRequest);
//
//        // THEN I have an empty basket
//        Assert.assertEquals(0, basket.getTotalQuantity());
//        Assert.assertEquals(0.00, basket.getCashTotal(), 0.00);
//    }
}
