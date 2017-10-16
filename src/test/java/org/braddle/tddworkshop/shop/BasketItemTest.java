package org.braddle.tddworkshop.shop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketItemTest {

    @Test
    public void testGetPrice()
    {
        Product product = new Product("123456", "A Thing", 150);

        BasketItem one = new BasketItem(product, 1);
        BasketItem two = new BasketItem(product, 2);
        BasketItem three = new BasketItem(product, 3);

        assertEquals(150, one.getPrice());
        assertEquals(300, two.getPrice());
        assertEquals(450, three.getPrice());
    }
}
