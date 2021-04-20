package wrapper;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APICaller {

    final String StringURL;
    JsonObject jsonData;

    APICaller(String URL) {
        StringURL = URL;
        getAPIData();
    }

    void getAPIData() {
        try {
            java.net.URL url = new URL(StringURL);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            //Getting the response code
            int responseCode = connection.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder inline = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();

                //Creates JsonObject with API Data
                JsonParser parser = new JsonParser();
                jsonData = parser.parse(inline.toString()).getAsJsonObject();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public JsonObject getJsonData() {
        return jsonData;
    }
}