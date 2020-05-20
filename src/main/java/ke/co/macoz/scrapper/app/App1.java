package ke.co.macoz.scrapper.app;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App1 {
    public static void main(String[] args) {
        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc = Jsoup.connect("https://www.codetriage.com/?language=Java").get();
            // Document doc =
            // Jsoup.connect("https://www.worldometers.info/coronavirus").get();

            // With the document fetched, we use JSoup's title() method to fetch the title
            System.out.printf("Title: %s\n", doc.title());

            // Extract elements in the document
            Elements tables = doc.getElementsByClass("repo-item");

            for (Element table : tables) {
                // Extract the title
                String tableTitle = table.getElementsByClass("repo-item-title").text();

                // Extract the number of issues on the table
                String tableIssues = table.getElementsByClass("repo-item-issues").text();

                // Extract the description of the table
                String tableDescription = table.getElementsByClass("repo-item-description").text();

                // Get the full name of the table
                String tableGithubName = table.getElementsByClass("repo-item-full-name").text();

                // The reposiory full name contains brackets that we remove first before
                // generating the valid Github link.
                String tableGithubLink = "https://github.com/" + tableGithubName.replaceAll("[()]", "");

                // Format and print the information to the console
                System.out.println(tableTitle + " - " + tableIssues);
                System.out.println("\t" + tableDescription);
                System.out.println("\t" + tableGithubLink);
                System.out.println("\n");
            }

            // In case of any IO errors, we want the messages written to the console
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * tableData.get(index).add(new
         * CovidByCountry(Integer.getInteger(members.get(0)),members.get(1),
         * members.get(2), members.get(3), members.get(4), members.get(5),
         * members.get(6), members.get(7), members.get(8), members.get(9),
         * members.get(10), members.get(11), members.get(12), members.get(13),
         * members.get(14), members.get(15)));
         */
    }
}