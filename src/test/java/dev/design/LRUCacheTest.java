package dev.design;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 7/24/17.
 */
public class LRUCacheTest {

    LRUCache cache = new LRUCache(2);


    @Test
    public void cache() throws Exception {
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));

    }

}