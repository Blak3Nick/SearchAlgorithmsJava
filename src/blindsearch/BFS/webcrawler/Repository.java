package blindsearch.BFS.webcrawler;

import java.util.*;
public class Repository {
    private Queue<String> bfsQueue ;
    private Set<String> urlVisitedSet;
    private int urlNo;

    public Repository() {
        this.bfsQueue =  new LinkedList<>();
        this.urlVisitedSet = new HashSet<>();
        this.urlNo = 0;
    }
}
