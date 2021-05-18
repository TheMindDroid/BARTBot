package computation;

import java.text.DecimalFormat;

public class DecimalFormatter {

    private final float unformatted;

    public DecimalFormatter(float unformatted) {
        this.unformatted = unformatted;
    }

    //Takes a dollar value and adds the tenths and hundredth's places
    public String format() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(unformatted);
    }
}