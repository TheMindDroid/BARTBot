package APIClasses;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class APIFareCalculator {

    private final String origin;
    private final String destination;
    private final JsonArray fareArray;

    public APIFareCalculator(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
        fareArray = getJSONArray();
    }

    private JsonArray getJSONArray() {
        //Initializes the APICaller class with a URL for the fare API
        APICaller jsonData = new APICaller("http://api.bart.gov/api/sched.aspx?cmd=fare&orig=" + origin +
                "&dest=" + destination + "&date=today&key=ZJ2R-PATE-9GXT-DWEI&json=y");

        //Navigates to the correct JSON Object and returns it
        return jsonData.getJsonData()
                .getAsJsonObject("root")
                .getAsJsonObject("fares")
                .getAsJsonArray("fare");
    }

    private String getFare(String name) {
        //Traverses JSONArray until fare data is reached
        for (JsonElement fare : fareArray) {
            JsonObject fareObject = fare.getAsJsonObject();
            if (fareObject.get("@name").getAsString().equals(name)) {
                return fareObject.get("@amount").getAsString();
            }
        }
        return "Fare data unavailable";
    }

    //Returns the fare data if using standard Clipper card or ticket
    public String getClipper() {
        return getFare("Clipper");
    }

    //Returns the fare data if using Youth Clipper card
    public String getYouthClipper() {
        return getFare("Youth Clipper");
    }

    //Returns the fare data if using Senior Clipper card
    public String getSeniorClipper() {
        return getFare("Senior/Disabled Clipper");
    }
}