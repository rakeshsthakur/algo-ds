package dev.stack;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/9/17.
 */
public class StackMinTest {


    @org.junit.Test
    public void min() throws Exception {

        StackMin sm = new StackMin();

        sm.push(1);
        sm.push(-1);
        assertEquals(-1, sm.min());
    }

}