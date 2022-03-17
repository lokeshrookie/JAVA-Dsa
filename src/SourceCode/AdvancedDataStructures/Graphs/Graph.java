package SourceCode.AdvancedDataStructures.Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Graph {
    // Graph contains edges and vertices in the form of U & V.
    // using adjacency matrix.
    // 1 based and 0 based indexing.
    //initially take all 0's in adjacency matrix. change 0 to 1 if edge found.

    /*
    ways to implemt graphs:
    1. Adjacency Graph.
    2. Adjacency List(Arraylist of Arraylist).
    3.
     */
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[][] adj = new int[n+1][n+1];

        //edge 1--12
        adj[1][2] = 1;
        adj[2][1] = 1;

        //

        ArrayList<Integer> adjj = new ArrayList<>();
//        for(int i = 0; i)

    }

}
