package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rthakur on 4/16/17.
 */
public class CheckPermutationTest {
    @Test
    public void isPermutationViaSort() throws Exception {
        assertTrue(CheckPermutation.isPermutationViaSort("Rak", "akR"));
        assertFalse(CheckPermutation.isPermutationViaSort("Rak", "ak"));
    }

    @Test
    public void isPermutation() {
        assertFalse(CheckPermutation.isPermutation("Rask", "Rakz"));
    }
}