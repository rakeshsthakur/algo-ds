package dev.stack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by rthakur on 6/8/17.
 */
public class SolutionTest {
    @Test
    public void isValid() throws Exception {

        assertTrue(BalancedBrackets.isValid("()"));
    }

}