package APIClasses;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class APIAdvisories {

    private final String advisories;
    private final String elevatorStatus;

    public APIAdvisories() {
        advisories = getJSONArray("https://api.bart.gov/api/bsa.aspx?cmd=bsa&key=ZJ2R-PATE-9GXT-DWEI&json=y");
        elevatorStatus =getJSONArray("https://api.bart.gov/api/bsa.aspx?cmd=elev&key=ZJ2R-PATE-9GXT-DWEI&json=y");
    }

    private String getJSONArray(String URL) {
        APICaller jsonData = new APICaller(URL);
        JsonArray jsonArray = jsonData.getJsonData().getAsJsonObject("root").getAsJsonArray("bsa");

        //Traverses JSONArray until fare data is reached
        for (JsonElement advisories : jsonArray) {
            JsonObject advisoriesObject = advisories.getAsJsonObject();
            if (advisoriesObject.get("description").isJsonObject()) {
                return advisoriesObject.getAsJsonObject("description").get("#cdata-section").getAsString();
            }
        }
        return "Advisory data unavailable.";
    }

    //Returns system advisories as a string
    public String getAdvisories() {
        return advisories;
    }

    //Returns elevator status as a string
    public String getElevatorStatus() {
        return elevatorStatus;
    }
}