package dev.graph;

import org.junit.Test;

/**
 * Created by rthakur on 4/19/17.
 */
public class DfsGraphTest {


    @Test
    public void dfsTest() {
        DfsGraph g = new DfsGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 2)");

        g.dfs(2, 4);
    }

}