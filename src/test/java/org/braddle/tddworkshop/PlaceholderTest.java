package org.braddle.tddworkshop;

import org.braddle.tddworkshop.Placeholder;
import org.junit.Assert;
import org.junit.Test;

public class PlaceholderTest {

    @Test
    public void trueIsTrue()
    {
        Placeholder placeholder = new Placeholder();

        Assert.assertTrue(placeholder.getTrue());
    }
}
