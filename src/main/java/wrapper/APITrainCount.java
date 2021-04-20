package wrapper;

public class APITrainCount {

    private final String trainCount;

    public APITrainCount() {
        trainCount = getJSONArray();
    }

    private String getJSONArray() {
        APICaller jsonData = new APICaller("http://api.bart.gov/api/bsa.aspx?cmd=count&key=ZJ2R-PATE-9GXT-DWEI&json=y");
        //Navigates to the JSON object containing the train count data
        return jsonData.getJsonData().getAsJsonObject("root").get("traincount").getAsString();
    }

    //Returns number of trains operational in system
    public String getTrainCount() {
        return trainCount;
    }
}
