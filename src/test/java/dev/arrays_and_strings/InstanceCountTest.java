package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 6/9/17.
 */
public class InstanceCountTest {
    @Test
    public void getInstance() throws Exception {
        assertEquals(2, InstanceCount.getInstance("abcabc", "abc"));
        assertEquals(2, InstanceCount.getInstance("ababa", "aba"));
    }

}