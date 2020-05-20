package ke.co.macoz.scrapper.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class CovidRepository {

    public List<List<String>> findAll() {

        List<String> tableHeaders = new ArrayList<String>();
        List<List<String>> tableData = new ArrayList<List<String>>();

        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc = Jsoup.connect("https://www.worldometers.info/coronavirus").get();

            // With the document fetched, we use JSoup's title() method to fetch the title
            // System.out.printf("Title: %s\n", doc.title());

            // Extract main table from the document
            Element table = doc.getElementById("main_table_countries_today");

            // Extract the <thead> elements
            Elements thead = table.getElementsByTag("thead");

            for (Element tagElement : thead) {
                Elements rowsCountries = tagElement.getElementsByTag("tr");
                for (Element row : rowsCountries) {
                    Elements datas = row.getElementsByTag("th");
                    for (Element data : datas) {
                        String dataString = data.getElementsByTag("th").text();
                        tableHeaders.add(dataString);
                    }
                    tableData.add(0, tableHeaders);
                }
            }

            // Extract the tbody element
            Elements tbody = table.getElementsByTag("tbody");

            for (Element tagElement : tbody) {
                // extract the <tbody> elements
                Elements rowsCountries = tagElement.getElementsByTag("tr");
                // declare index for <td>
                int index = 1;

                for (Element row : rowsCountries) {

                    Elements datas = row.getElementsByTag("td");
                    List<String> members = new ArrayList<String>();

                    for (Element data : datas) {
                        String dataString = data.getElementsByTag("td").text();
                        members.add(dataString);
                    }
                    // Add the row data to the 3D array.
                    tableData.add(index, members);
                    index++;
                }
            }
            System.out.println(tableData.toString());
            // In case of any IO errors, we want the messages written to the console
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tableData;
    }
}