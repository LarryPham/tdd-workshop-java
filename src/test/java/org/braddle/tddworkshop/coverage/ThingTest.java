package org.braddle.tddworkshop.coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThingTest {

    @Test
    public void whenATrue_andBFalse() {
        Thing thing = new Thing();

        assertEquals(2, thing.doThing(true, false));
    }
}
