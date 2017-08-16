package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 6/16/17.
 */
public class LongestCommonPrexfixTest {
    @Test
    public void getLongestCommonPrefix() throws Exception {

        assertEquals("a", LongestCommonPrexfix.getLongestCommonPrefix(new String[]{"ad", "abcd", "abc"}));
    }

}