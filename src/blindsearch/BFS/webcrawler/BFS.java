package blindsearch.BFS.webcrawler;

import java.util.*;
import java.net.*;
import java.io.*;


public class BFS {
    private String firstURL;
    private int maximumURLNo;
    private String urlPatterns;
    private Repository repository ;



    public BFS(String firstURL, int maximumURLNo, String urlPatterns, Repository repository) {
        this.firstURL = firstURL;
        this.maximumURLNo = maximumURLNo;
        this.urlPatterns = urlPatterns;
        this.repository = repository;
    }
    public Set<String> bfs() {
        repository.addURLtoSet(this.firstURL);
        while (repository.isQueueEmpty() == false) {
            String currentURL = repository.removeURLfromQUEUE();

            if (repository.getUrlNo() > this.maximumURLNo) {
                return this.repository.getUrlVisitedSet();
            }

        }
        return null;
    }
}
