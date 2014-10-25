package pachet.lab;

import java.util.ArrayList;

/**
 * Created by roxy on 10/25/2014.
 * Main class for Baby
 */
public class Main {

    public static void main(String[] arguments) {

        /** Am declarat un bebelus */
        Baby david = new Baby();

        /** am setat numele */
        david.name = "David";

        /** am setat ca este baiat */
        david.setMale(true);

        /** am setat greutatea */
        david.weight=3.0;

        /** am setat decibelii */
        david.decibels=100;

        /** david trebuie schimbat */
        david.poop();


    }
}
