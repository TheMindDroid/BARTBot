package APIClasses;

public class APITrainCount {

    private final String trainCount;

    public APITrainCount() {
        trainCount = getJSONArray("http://api.bart.gov/api/bsa.aspx?cmd=count&key=ZJ2R-PATE-9GXT-DWEI&json=y");
    }

    private String getJSONArray(String URL) {
        APICaller jsonData = new APICaller(URL);
        //Navigates to the JSON object containing the train count data
        return jsonData.getJsonData().getAsJsonObject("root").get("traincount").getAsString();
    }

    //Returns number of trains operational in system
    public String getTrainCount() {
        return trainCount;
    }
}
