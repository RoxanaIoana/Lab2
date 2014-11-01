package pachet.lab;

/**
 * Created by roxy on 10/20/2014.
 * A class for babies
 */
public class Baby {

    /** membrii clasei */
    public String name;
    private boolean isMale;
    double weight;
    double decibels;
    int age;


     /** functie pentru a seta daca bebelusul este baiat sau fata */
    public void setMale(boolean isMale) {

        this.isMale = isMale;
    }

    int numPoops = 0;

    /** functie pentru a anunta mama ca trebuie schimbat scutecul */
    public void poop() {
        numPoops += 1;
        System.out.println("Dear mother, " +
                "I have pooped. Ready the diaper.");
    }

    public void setAge(int value){

        age=value;
    }


}
