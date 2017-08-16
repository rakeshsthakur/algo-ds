package dev.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 4/18/17.
 */
public class RemoveDupsTest {
    @Test
    public void removeDups() throws Exception {

        RemoveDups<Integer> target = new RemoveDups<>();

        LinkedList<Integer> node = new LinkedList<>();

        node.add(1);
        node.add(2);

        target.removeDups(node);
        assertEquals(2, node.length);
        assertEquals(2, node.last.data);
    }

}