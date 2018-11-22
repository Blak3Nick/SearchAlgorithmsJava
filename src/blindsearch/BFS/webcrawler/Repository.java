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
    public void addURLtoQueue(String url) {
        bfsQueue.add(url);
    }

    public String removeURLfromQUEUE() {
        return bfsQueue.poll();
    }
    public void addURLtoSet(String url) {
        urlVisitedSet.add(url);
        this.urlNo ++;
    }
    public int getUrlNo() {
        return this.urlNo;
    }
    public boolean isQueueEmpty() {
        return this.bfsQueue.isEmpty();
    }

    public boolean setHasURL(String url) {
        return this.urlVisitedSet.contains(url);
    }
    public Set<String> getUrlVisitedSet() {
        return urlVisitedSet;
    }


}
