package dev.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rthakur on 4/25/17.
 */
public class ReverseAnIntegerTest {
    @Test
    public void reverse() throws Exception {

        Assert.assertEquals(-321, ReverseAnInteger.reverse(-123));
    }

}