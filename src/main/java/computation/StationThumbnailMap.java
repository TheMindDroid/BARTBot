package computation;

import java.util.LinkedHashMap;

public class StationThumbnailMap {

    public LinkedHashMap<String, String> stnThumbMap() {

        String URLBeginning = "https://www.bart.gov/sites/default/files/styles/station-intro-img/public/images/station/";

        //A HashMap containing a list of stations and their API abbreviations
        final LinkedHashMap<String, String> stnThumbMap = new LinkedHashMap<>();
            stnThumbMap.put("12th", URLBeginning + "12th-street.jpg");
            stnThumbMap.put("16th", URLBeginning + "16th-street.jpg");
            stnThumbMap.put("19th", URLBeginning + "19th-Street.jpg");
            stnThumbMap.put("24th", URLBeginning + "24th-street.jpg");
            stnThumbMap.put("ashb", URLBeginning + "ashby.jpg");
            stnThumbMap.put("antc", URLBeginning + "antioch.jpg");
            stnThumbMap.put("balb", URLBeginning + "balboa-park.jpg");
            stnThumbMap.put("bayf", URLBeginning + "bay-fair.jpg");
            stnThumbMap.put("bery", URLBeginning + "berryessa.jpg");
            stnThumbMap.put("cast", URLBeginning + "castro-valley.jpg");
            stnThumbMap.put("civc", URLBeginning + "civic-center.jpg");
            stnThumbMap.put("cols", URLBeginning + "coliseum.jpg");
            stnThumbMap.put("colm", URLBeginning + "colma.jpg");
            stnThumbMap.put("conc", URLBeginning + "concord.jpg");
            stnThumbMap.put("daly", URLBeginning + "daly-city.jpg");
            stnThumbMap.put("dbrk", URLBeginning + "downtown-berkeley.jpg");
            stnThumbMap.put("dubl", URLBeginning + "dublin.jpg");
            stnThumbMap.put("deln", URLBeginning + "el-cerrito-del-norte.jpg");
            stnThumbMap.put("plza", URLBeginning + "el-cerrito-plaza.jpg");
            stnThumbMap.put("embr", URLBeginning + "embarcadero.jpg");
            stnThumbMap.put("frmt", URLBeginning + "fremont.jpg");
            stnThumbMap.put("ftvl", URLBeginning + "fruitvale.jpg");
            stnThumbMap.put("glen", URLBeginning + "glen-park.jpg");
            stnThumbMap.put("hayw", URLBeginning + "hayward.jpg");
            stnThumbMap.put("lafy", URLBeginning + "lafayette.jpg");
            stnThumbMap.put("lake", URLBeginning + "lake-merritt.jpg");
            stnThumbMap.put("mcar", URLBeginning + "macarthur.jpg");
            stnThumbMap.put("mlbr", URLBeginning + "millbrae.jpg");
            stnThumbMap.put("mlpt", URLBeginning + "milpitas.jpg");
            stnThumbMap.put("mont", URLBeginning + "montgomery.jpg");
            stnThumbMap.put("nbrk", URLBeginning + "north-berkeley.jpg");
            stnThumbMap.put("ncon" ,URLBeginning + "north-concord.jpg");
            stnThumbMap.put("oakl", URLBeginning + "oakland-international-airport.jpg");
            stnThumbMap.put("orin", URLBeginning + "orinda.jpg");
            stnThumbMap.put("pitt", URLBeginning + "pittsburg-bay-point.jpg");
            stnThumbMap.put("pctr", URLBeginning + "pittsburg-center.jpg");
            stnThumbMap.put("phil", URLBeginning + "pleasant-hill.jpg");
            stnThumbMap.put("powl", URLBeginning + "powell-street.jpg");
            stnThumbMap.put("rich", URLBeginning + "richmond.jpg");
            stnThumbMap.put("rock", URLBeginning + "rockridge.jpg");
            stnThumbMap.put("sbrn", URLBeginning + "san-bruno.jpg");
            stnThumbMap.put("sfia", URLBeginning + "san-francisco-international-airport.jpg");
            stnThumbMap.put("sanl", URLBeginning + "san-leandro.jpg");
            stnThumbMap.put("shay", URLBeginning + "south-hayward.jpg");
            stnThumbMap.put("ssan", URLBeginning + "south-san-francisco.jpg");
            stnThumbMap.put("ucty", URLBeginning + "union-city.jpg");
            stnThumbMap.put("warm", URLBeginning + "warm-springs.jpg");
            stnThumbMap.put("wcrk", URLBeginning + "walnut-creek.jpg");
            stnThumbMap.put("wdub", URLBeginning + "west-dublin.jpg");
            stnThumbMap.put("woak", URLBeginning + "west-oakland.jpg");

        return stnThumbMap;
    }

    public String getStationThumbnail(String abbreviation) {
        return stnThumbMap().get(abbreviation);
    }
}