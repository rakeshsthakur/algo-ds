package dev.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/16/17.
 */
public class QueueViaStackTest {

    QueueViaStack queue = new QueueViaStack();

    @Test
    public void add() throws Exception {
        queue.add(1);
        assertEquals(1, queue.size());
        assertEquals(1, queue.peek());
    }


    @Test
    public void remove() throws Exception {
        queue.add(2);
        assertEquals(2, queue.peek());
    }

}