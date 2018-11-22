package blindsearch.BFS.webcrawler;

import java.util.*;
import java.net.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
    public Set<String> bfs() throws IOException{
        repository.addURLtoSet(this.firstURL);
        while (repository.isQueueEmpty() == false) {
            String currentURL = repository.removeURLfromQUEUE();

            if (repository.getUrlNo() > this.maximumURLNo) {
                return this.repository.getUrlVisitedSet();
            }
            boolean correctURLFound = false;
            URL url = null;
            BufferedReader bufferedReader = null;

            while ( correctURLFound == false) {
                try {
                    url = new URL(currentURL);
                    try {
                         bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                    }catch (IOException e) {
                        System.out.println("Error in buffered reader " + e.getMessage() + currentURL);
                        e.printStackTrace();
                    }
                    correctURLFound = true;
                } catch (MalformedURLException e) {
                    System.out.println("Error in url " + e.getMessage() + currentURL);
                    e.printStackTrace();
                }

            }
            StringBuilder stringBuilder = new StringBuilder();

            while ((currentURL = bufferedReader.readLine()) != null) {
                    stringBuilder.append(currentURL);
            }
            currentURL= stringBuilder.toString();
            Pattern pattern = Pattern.compile(this.urlPatterns);
            Matcher matcher = pattern.matcher(currentURL);

            while (matcher.find()) {
                String urlString = matcher.group();

                if (this.repository.setHasURL(urlString) == false) {
                    this.repository.addURLtoSet(urlString);
                    System.out.println(urlString);
                    repository.addURLtoQueue(urlString);
                }
            }
        }
        return null;
    }
}
