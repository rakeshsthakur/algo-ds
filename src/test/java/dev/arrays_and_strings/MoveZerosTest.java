package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by rthakur on 7/7/17.
 */
public class MoveZerosTest {
    @Test
    public void moveZeros() throws Exception {

        assertArrayEquals(new int[]{1, 2, 3}, MoveZeros.moveZeros(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 0}, MoveZeros.moveZeros(new int[]{0, 1}));
        assertArrayEquals(new int[]{1, 2, 0}, MoveZeros.moveZeros(new int[]{0, 1, 2}));
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, MoveZeros.moveZeros(new int[]{0, 1, 0, 3, 12}));

    }

}