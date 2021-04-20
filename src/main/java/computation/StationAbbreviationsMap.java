package computation;

import java.util.HashMap;

public class StationAbbreviationsMap {

    public HashMap<String, String> getStnAbbrMap() {

        //A HashMap containing a list of stations and their API abbreviations
        final HashMap<String, String> stnAbbrMap = new HashMap<>();
            stnAbbrMap.put("12th", "12th St. Oakland City Center");
            stnAbbrMap.put("16th", "6th St. Mission (SF)");
            stnAbbrMap.put("19th", "19th St. Oakland");
            stnAbbrMap.put("24th", "24th St. Mission (SF)");
            stnAbbrMap.put("ashb", "Ashby (Berkeley)");
            stnAbbrMap.put("antc", "Antioch");
            stnAbbrMap.put("balb", "Balboa Park (SF)");
            stnAbbrMap.put("bayf,", "Bay Fair (San Leandro)");
            stnAbbrMap.put("bery", "Berryessa");
            stnAbbrMap.put("cast", "Castro Valley");
            stnAbbrMap.put("civc", "Civic Center (SF)");
            stnAbbrMap.put("cols", "Coliseum");
            stnAbbrMap.put("colm", "Colma");
            stnAbbrMap.put("conc", "Concord");
            stnAbbrMap.put("daly", "Daly City");
            stnAbbrMap.put("dbrk", "Downtown Berkeley");
            stnAbbrMap.put("dubl", "Dublin/Pleasanton");
            stnAbbrMap.put("deln", "El Cerrito del Norte");
            stnAbbrMap.put("plza", "El Cerrito Plaza");
            stnAbbrMap.put("embr", "Embarcadero (SF)");
            stnAbbrMap.put("frmt", "Fremont");
            stnAbbrMap.put("ftvl", "Fruitvale (Oakland)");
            stnAbbrMap.put("glen", "Glen Park (SF)");
            stnAbbrMap.put("hayw", "Hayward");
            stnAbbrMap.put("lafy", "Lafayette");
            stnAbbrMap.put("lake", "Lake Merritt (Oakland)");
            stnAbbrMap.put("mcar", "MacArthur (Oakland)");
            stnAbbrMap.put("mlbr", "Millbrae");
            stnAbbrMap.put("mlpt", "Milpitas");
            stnAbbrMap.put("mont", "Montgomery St. (SF)");
            stnAbbrMap.put("nbrk", "North Berkeley");
            stnAbbrMap.put("ncon" ,"North Concord/Martinez");
            stnAbbrMap.put("oakl", "Oakland International Airport");
            stnAbbrMap.put("orin", "Orinda");
            stnAbbrMap.put("pitt", "Pittsburg/Bay Point");
            stnAbbrMap.put("pctr", "Pittsburg Center");
            stnAbbrMap.put("phil", "Pleasant Hill");
            stnAbbrMap.put("powl", "Powell St. (SF)");
            stnAbbrMap.put("rich", "Richmond");
            stnAbbrMap.put("rock", "Rockridge (Oakland)");
            stnAbbrMap.put("sbrn", "San Bruno");
            stnAbbrMap.put("sfia", "San Francisco International Airport");
            stnAbbrMap.put("sanl", "San Leandro");
            stnAbbrMap.put("shay", "South Hayward");
            stnAbbrMap.put("ssan", "South San Francisco");
            stnAbbrMap.put("ucty", "Union City");
            stnAbbrMap.put("warm", "Warm Springs/South Fremont");
            stnAbbrMap.put("wcrk", "Walnut Creek");
            stnAbbrMap.put("wdub", "West Dublin");
            stnAbbrMap.put("woak", "West Oakland");

        return stnAbbrMap;
    }

    //Returns the complete station abbreviation HashMap
    public String getStationName(String abbreviation) {
        return getStnAbbrMap().get(abbreviation);
    }

    //Checks to see if given abbreviation exists in map
    public boolean containsAbbreviation(String abbreviation) {
        return getStnAbbrMap().containsKey(abbreviation);
    }
}