package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/30/17.
 */
public class MajorityElementTest {
    @Test
    public void majorityElement() throws Exception {

        assertEquals(5, MajorityElement.majorityElement(new int[]{6, 5, 5}));
    }

}