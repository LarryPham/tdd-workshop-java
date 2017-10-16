package org.braddle.tddworkshop.shop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasketTest {

    @Test
    public void testGetTotal() {
        BasketItem one = new BasketItem(new Product("1", "1", 100), 1);
        BasketItem two = new BasketItem(new Product("2", "2", 225), 2);
        BasketItem three = new BasketItem(new Product("3", "3", 325), 3);

        Basket basket = new Basket();
        basket.add(one);
        basket.add(two);
        basket.add(three);

        assertEquals(1525, basket.getTotal()); //1525
    }

    @Test
    public void testIsEmpty() {
        Basket empty = new Basket();

        Basket one = new Basket();
        one.add(new BasketItem(new Product("1", "1", 100), 1));

        assertTrue(empty.isEmpty());
        assertFalse(one.isEmpty());
    }

    @Test
    public void testHetNumberOfItems() {
        BasketItem one = new BasketItem(new Product("1", "1", 100), 1);
        BasketItem two = new BasketItem(new Product("2", "2", 225), 2);
        BasketItem three = new BasketItem(new Product("3", "3", 325), 3);

        Basket basket = new Basket();
        basket.add(one);
        basket.add(two);
        basket.add(three);

        assertEquals(6, basket.getNumberOfItems());
    }
}
