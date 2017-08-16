package dev.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by rthakur on 4/9/17.
 */


public class DfsGraph {
    int numberOfVertices;
    LinkedList<Integer> adj[];

    DfsGraph(int v) {
        numberOfVertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);

    }

    void dfs(int startVertex, int endVertex) {
        boolean visited[] = new boolean[numberOfVertices];

        dfsUtil(startVertex, visited, endVertex);
    }

    private void dfsUtil(int startVertex, boolean[] visited, int endVertex) {
        int currentVertex = startVertex;
        visited[currentVertex] = true;
        System.out.printf(currentVertex + " ");
        Iterator<Integer> itr = adj[currentVertex].listIterator();

        while (itr.hasNext()) {
            int nextVertex = itr.next();
            if (!visited[nextVertex]) {
                dfsUtil(nextVertex, visited, endVertex);
            }
        }

    }


}


