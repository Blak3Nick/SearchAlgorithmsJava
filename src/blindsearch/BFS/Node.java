package blindsearch.BFS;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Object element;
    private boolean visited;
    private java.util.List<Node> neighbors;

    public Node(Object object) {
        this.element = object;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    public boolean isVisited() {

        return this.visited;
    }

    public void addNeighbors(Node node) {
        this.neighbors.add(node);
    }

    public Object getElement() {

        return this.element;
    }

    public void setElement(Object object) {
        this.element = object;
    }


    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Node> getNeighbors() {

        return this.neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
}
