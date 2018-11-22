package blindsearch.BFS.webcrawler;

import java.io.*;
import java.net.*;
import java.util.*;

public class WebCrawler {


    public WebCrawler() {
    }

    public static void main(String[] args) {
        String firstWebsite = "https://www.alimirjalili.com";
        String patterns = "http[s]*://(\\w\\.)*(\\w+)";
        Repository repository = new Repository();
        BFS myCrawler = new BFS(firstWebsite, 50, patterns, repository);

        try {
            Set<String> urlCrawled = myCrawler.bfs();
            System.out.println(urlCrawled.size());
            for (String s : urlCrawled) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
