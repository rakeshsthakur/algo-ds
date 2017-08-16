package dev.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by rthakur on 4/10/17.
 */
public class StackOfPlatesTest {

    StackOfPlates stack = new StackOfPlates();

    @Test
    public void push() throws Exception {

        stack.push(1);
        stack.push(2);

//        assertEquals(1, java.util.Optional.ofNullable(stack.pop()));


        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.pop());
        assertNull(stack.pop());

        stack.push(2);


        assertEquals(2, (int) stack.pop());
//        assertEquals(1, (int)stack.pop());

    }

    @Test
    public void pop() throws Exception {
    }

}