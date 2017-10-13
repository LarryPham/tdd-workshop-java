package org.braddle.tddworkshop.licence;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by mark.bradley on 13/10/2017.
 */
public class PersonTest {

    @Test
    public void testGetInitials() {
        Person mark = new Person("Mark David Bradley", new Date(1997, 05, 12));
        Person harry = new Person("Harry Jim James Smith", new Date(1985, 10, 9));
        Person jane = new Person("Jane Bond", new Date(2001, 1 , 1));

        assertEquals("MDB", mark.getInitials());
        assertEquals("HJJS", harry.getInitials());
        assertEquals("JB", jane.getInitials());
    }
}
