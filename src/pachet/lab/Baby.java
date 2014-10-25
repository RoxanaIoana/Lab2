package pachet.lab;

/**
 * Created by roxy on 10/20/2014.
 * A class for babies
 */
public class Baby {

    public String name;
    private boolean isMale;
    double weight;
    double decibels;

    public boolean isMale() {

        return isMale;
    }

    public void setMale(boolean isMale) {

        this.isMale = isMale;
    }

    int numPoops = 0;

    public void poop() {
        numPoops += 1;
        System.out.println("Dear mother, " +
                "I have pooped. Ready the diaper.");
    }


}
