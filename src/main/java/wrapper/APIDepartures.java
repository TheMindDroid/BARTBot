package wrapper;

import com.google.gson.JsonArray;

public class APIDepartures {

    private final String origin;
    private final JsonArray departuresArray;

    public APIDepartures(String origin) {
        this.origin = origin;
        departuresArray = getJSONArray();
    }

    private JsonArray getJSONArray() {
        //Initializes the APICaller class with a URL for the fare API
        APICaller jsonData = new APICaller("https://api.bart.gov/api/etd.aspx?cmd=etd&orig=" + origin
                + "&key=MW9S-E7SL-26DU-VV8V&json=y");

        return jsonData.getJsonData().getAsJsonObject("root").getAsJsonArray("station");

    }

    public JsonArray getDeparturesArray() {
        return departuresArray;
    }
}