package blindsearch.BFS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node n1 = new Node(1);
        Node n2 = new Node (2);
        Node n3 = new Node (3);
        Node n4 = new Node (4);
        Node n5 = new Node (5);
        Node n6 = new Node (6);
        Node n7 = new Node (7);

        n1.addNeighbors(n2);
        n1.addNeighbors(n3);
        n2.addNeighbors(n4);
        n2.addNeighbors(n5);
        n3.addNeighbors(n6);
        n3.addNeighbors(n7);

        List<Node> allNodes = new ArrayList<>();
        allNodes.add(n1);
        allNodes.add(n2);
        allNodes.add(n3);
        allNodes.add(n4);
        allNodes.add(n5);
        allNodes.add(n6);
        allNodes.add(n7);
        graph.setAllNodes(allNodes);

        BFS bfsSearchEngine = new BFS();
        bfsSearchEngine.bfs(graph);



    }
}
