package computation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddDatedFooter {

    public String addDatedFooter() {
        //Adds a timestamp to the footer of all Discord messages
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        Date date = new Date();

        return "Request was made at " + formatter.format(date);
    }
}
