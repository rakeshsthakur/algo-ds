package dev.sort_search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/16/17.
 */
public class QuickSearchTest {
    @Test
    public void quickSearch() throws Exception {
        int[] input = {1, 2, 3, 4};
        assertEquals(2, QuickSearch.quickSearch(input, 3));
    }

}