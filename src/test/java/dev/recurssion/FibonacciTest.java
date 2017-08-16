package dev.recurssion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/16/17.
 */
public class FibonacciTest {
    @Test
    public void fibonacci() throws Exception {

//       assertEquals(BigInteger("280571172992510140037611932413038677189525")), Fibonacci.fibonacci(200));
    }


    @Test
    public void fibRec() {
        assertEquals(5, Fibonacci.fibRec(5));
    }

}