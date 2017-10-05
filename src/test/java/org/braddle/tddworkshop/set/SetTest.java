package org.braddle.tddworkshop.set;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SetTest {

    @Test
    public void testEmpty() {
        Set empty = new Set();

        assertTrue(empty.isEmpty());

        Set one = new Set();
        one.add("one");

        assertFalse(one.isEmpty());
    }

    @Test
    public void testcount() {
        Set empty = new Set();

        Set one = new Set();
        one.add("one");

        Set many = new Set();
        many.add("one");
        many.add("two");

        assertEquals(0, empty.size());
        assertEquals(1, one.size());
        assertTrue(many.size() > 1);
    }

    @Test
    public void testContains() {
        Set empty = new Set();

        Set one = new Set();
        one.add("one");

        assertFalse(empty.contains("one"));

        assertTrue(one.contains("one"));
    }

    @Test
    public void testDuplicateValues() {
        Set one = new Set();
        one.add("one");
        one.add("one");

        assertEquals(1, one.size());
    }

    @Test
    public void testRemove() {
        Set one = new Set();
        one.add("one");
        one.remove("one");

        assertEquals(0, one.size());
        assertTrue(one.isEmpty());
        assertFalse(one.contains("one"));

        Set cereal = new Set();
        cereal.add("snap");
        cereal.add("crackle");
        cereal.add("pop");

        cereal.remove("crackle");

        assertEquals(2, cereal.size());
        assertTrue(cereal.contains("snap"));
        assertTrue(cereal.contains("pop"));

        assertFalse(cereal.contains("crackle"));
    }

    @Test
    public void testGrowing()
    {
        Set two = new Set(1);
        two.add("one");
        two.add("two");

        assertEquals(2, two.size());
    }
}
