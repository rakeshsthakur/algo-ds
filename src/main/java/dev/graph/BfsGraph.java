package dev.graph;


import java.util.LinkedList;

public class BfsGraph {

    int numOfVertices;

    LinkedList<Integer>[] adj;


    public void BfsGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        for (int i = 0; i < numOfVertices; i++) {
            adj[i] = new LinkedList<>();
        }
        adj = new LinkedList[numOfVertices];
    }


    public void addEdge(int edgeToAppendTo, int newEdge) {
        adj[edgeToAppendTo].add(newEdge);
    }

}
