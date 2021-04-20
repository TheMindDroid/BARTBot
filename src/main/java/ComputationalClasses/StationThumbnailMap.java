package ComputationalClasses;

import java.util.HashMap;

public class StationThumbnailMap {

    public HashMap<String, String> stnThumbMap() {

        String URLBeginning = "https://www.bart.gov/sites/default/files/styles/station-intro-img/public/images/station/";

        //A HashMap containing a list of stations and their API abbreviations
        final HashMap<String, String> stnThumbMap = new HashMap<>();
            stnThumbMap.put("12th", URLBeginning + "12th-street.jpg?itok=Vf3hVt3q");
            stnThumbMap.put("16th", URLBeginning + "16th-street.jpg?itok=EqSGzKBF");
            stnThumbMap.put("19th", URLBeginning + "19th-Street.jpg?itok=JysKsZu_");
            stnThumbMap.put("24th", URLBeginning + "24th-street.jpg?itok=fJNGz4SG");
            stnThumbMap.put("ashb", URLBeginning + "ashby.jpg?itok=QPxWXSmA");
            stnThumbMap.put("antc", URLBeginning + "antioch.jpg?itok=GgKXkkQu");
            stnThumbMap.put("balb", URLBeginning + "balboa-park.jpg?itok=T9utxmcY");
            stnThumbMap.put("bayf,", URLBeginning + "bay-fair.jpg?itok=2sne3dIp");
            stnThumbMap.put("bery", URLBeginning + "berryessa.jpg?itok=VRhzvtnz");
            stnThumbMap.put("cast", URLBeginning + "castro-valley.jpg?itok=ibY6doUg");
            stnThumbMap.put("civc", URLBeginning + "civic-center.jpg?itok=adgkQ-wt");
            stnThumbMap.put("cols", URLBeginning + "coliseum.jpg?itok=obXQaLB1");
            stnThumbMap.put("colm", URLBeginning + "colma.jpg?itok=EBa1P5Ug");
            stnThumbMap.put("conc", URLBeginning + "concord.jpg?itok=Uty5q2qx");
            stnThumbMap.put("daly", URLBeginning + "daly-city.jpg?itok=CZhK1SwY");
            stnThumbMap.put("dbrk", URLBeginning + "downtown-berkeley.jpg?itok=WR-Hf3Yq");
            stnThumbMap.put("dubl", URLBeginning + "dublin.jpg?itok=J11_w6HH");
            stnThumbMap.put("deln", URLBeginning + "el-cerrito-del-norte.jpg?itok=cbXyV-Pm");
            stnThumbMap.put("plza", URLBeginning + "el-cerrito-plaza.jpg?itok=cSTkcIXE");
            stnThumbMap.put("embr", URLBeginning + "embarcadero.jpg?itok=NPonaQb3");
            stnThumbMap.put("frmt", URLBeginning + "fremont.jpg?itok=igL6eHjO");
            stnThumbMap.put("ftvl", URLBeginning + "fruitvale.jpg?itok=wcDBnJxB");
            stnThumbMap.put("glen", URLBeginning + "glen-park.jpg?itok=qzutgm-s");
            stnThumbMap.put("hayw", URLBeginning + "hayward.jpg?itok=c93R0DVv");
            stnThumbMap.put("lafy", URLBeginning + "lafayette.jpg?itok=H6fr5T0q");
            stnThumbMap.put("lake", URLBeginning + "lake-merritt.jpg?itok=3kvr1PNU");
            stnThumbMap.put("mcar", URLBeginning + "macarthur.jpg?itok=4CEyqDqj");
            stnThumbMap.put("mlbr", URLBeginning + "millbrae.jpg?itok=W6NhONdz");
            stnThumbMap.put("mlpt", URLBeginning + "milpitas.jpg?itok=wGf4YWX-");
            stnThumbMap.put("mont", URLBeginning + "montgomery.jpg?itok=RVv1h1ez");
            stnThumbMap.put("nbrk", URLBeginning + "north-berkeley.jpg?itok=q5_Y-mq2");
            stnThumbMap.put("ncon" ,URLBeginning + "north-concord.jpg?itok=KgD8Dszq");
            stnThumbMap.put("oakl", URLBeginning + "oakland-international-airport.jpg?itok=w9QNuVOV");
            stnThumbMap.put("orin", URLBeginning + "orinda.jpg?itok=4cvZm0lb");
            stnThumbMap.put("pitt", URLBeginning + "pittsburg-bay-point.jpg?itok=n6ox14L6");
            stnThumbMap.put("pctr", URLBeginning + "pittsburg-center.jpg?itok=n65OYJKi");
            stnThumbMap.put("phil", URLBeginning + "pleasant-hill.jpg?itok=RqEaPrBD");
            stnThumbMap.put("powl", URLBeginning + "powell-street.jpg?itok=yArCXtX-");
            stnThumbMap.put("rich", URLBeginning + "richmond.jpg?itok=OKaABGD9");
            stnThumbMap.put("rock", URLBeginning + "rockridge.jpg?itok=0sSfHSxD");
            stnThumbMap.put("sbrn", URLBeginning + "san-bruno.jpg?itok=B8c4IuSp");
            stnThumbMap.put("sfia", URLBeginning + "san-francisco-international-airport.jpg?itok=cFpRfS0V");
            stnThumbMap.put("sanl", URLBeginning + "san-leandro.jpg?itok=M7mGrsnC");
            stnThumbMap.put("shay", URLBeginning + "south-hayward.jpg?itok=2btrg6VY");
            stnThumbMap.put("ssan", URLBeginning + "south-san-francisco.jpg?itok=ZVIPRJ1z");
            stnThumbMap.put("ucty", URLBeginning + "union-city.jpg?itok=6LJSsroL");
            stnThumbMap.put("warm", URLBeginning + "warm-springs.jpg?itok=mbG22CaA");
            stnThumbMap.put("wcrk", URLBeginning + "walnut-creek.jpg?itok=2BwDld33");
            stnThumbMap.put("wdub", URLBeginning + "west-dublin.jpg?itok=dn42k2Nc");
            stnThumbMap.put("woak", URLBeginning + "west-oakland.jpg?itok=-k1-HUn3");

        return stnThumbMap;
    }

    public String getStationThumbnail(String abbreviation) {
        return stnThumbMap().get(abbreviation);
    }
}