package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/17/17.
 */
public class IntegerFromStringTest {
    @Test
    public void getInteger() throws Exception {

        assertEquals(1234, (int) IntegerFromString.getInteger("1234"));
    }

}