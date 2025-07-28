package data.structures.graph;

public class Main {
    public static void main(String[] args) {

        /*  Remove Edge Example

                          -A-
                        -B- -c-

                           A-
                         B- -C-
         */

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");

        myGraph.printGraph();

        myGraph.removeEdge("A", "B");
        myGraph.printGraph();


        System.out.println("Next Example: -> ");
        /*
        Remove Vertex Example
           */

        Graph removeVertex = new Graph();
        removeVertex.addVertex("A");
        removeVertex.addVertex("B");
        removeVertex.addVertex("C");
        removeVertex.addVertex("D");

        removeVertex.addEdge("A", "B");
        removeVertex.addEdge("A", "C");
        removeVertex.addEdge("A", "D");
        removeVertex.addEdge("B", "D");
        removeVertex.addEdge("C", "D");

        removeVertex.printGraph();

        removeVertex.removeVertex("D");
        removeVertex.printGraph();

    }

}
