package dev.graph;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by rthakur on 7/26/17.
 */
public class DFSRound2 {

    int numberOfVertices;

    LinkedList<Integer> adj[];

    public DFSRound2(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adj = new LinkedList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        DFSRound2 g = new DFSRound2(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        g.dfsHelper();


    }

    void addEdge(int edge, int newEdge) {
        adj[edge].add(newEdge);
    }

    public void dfsHelper() {
        boolean visited[] = new boolean[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            dfsHelper(i, visited);

        }

    }

    public void dfsHelper(int i, boolean visited[]) {
        if (!visited[i]) {
            visited[i] = true;
            System.out.println(i);
            Iterator<Integer> itr = adj[i].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                dfsHelper(n, visited);
            }

        }

    }


}
