package dev.graph;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rthakur on 7/26/17.
 */
public class BFSRound2 {

    int numberOfVertices;
    LinkedList<Integer> adj[];

    public BFSRound2(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adj = new LinkedList[numberOfVertices];

        for (int i = 0; i < numberOfVertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        BFSRound2 g = new BFSRound2(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.bfs(2);
    }

    public void addEdge(int edge, int newEdge) {
        adj[edge].add(newEdge);
    }

    public void bfs(int s) {

        boolean[] visited = new boolean[numberOfVertices];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            visited[s] = true;
            System.out.println(s);

            Iterator<Integer> itr = adj[s].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }
}
