package blindsearch.BFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private Queue<Node> myQueue;

    public BFS() {
        this.myQueue = new LinkedList<>();
    }

    public void bfs(Graph graph) {
        List<Node> nodeList = graph.getAllNodes();
        for (Node node : nodeList) {
            if (node.isVisited() == false) {
                node.setVisited(true);
                bfsInQueue(node);
            }

        }
    }

    public void bfsInQueue(Node node) {
        this.myQueue.add(node);
        node.setVisited(true);

        while (this.myQueue.isEmpty() == false) {
            Node currentNode = this.myQueue.remove();
            System.out.println("Node removed and visited: " + currentNode.getElement().toString());

            for (Node n : currentNode.getNeighbors()) {
                if (n.isVisited() == false) {
                    n.setVisited(true);
                    this.myQueue.add(n);
                }
            }
        }
    }
}
