package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/16/17.
 */
public class CompressedStringTest {
    @Test
    public void getCompressedString() throws Exception {

        assertEquals("Rak", CompressedString.getCompressedString("Rak"));
        assertEquals("Rakk", CompressedString.getCompressedString("Rakk"));
        assertEquals("a2b1c3d3", CompressedString.getCompressedString("aabcccddd"));
    }

}