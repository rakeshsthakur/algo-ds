package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rthakur on 4/16/17.
 */
public class IsUniqueTest {
    @Test
    public void isUniqueChars() throws Exception {

        assertTrue(IsUnique.isUniqueChars("Rakesh"));
        assertFalse(IsUnique.isUniqueChars("Rakeshe"));

    }

}