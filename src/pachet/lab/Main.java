package pachet.lab;

import java.util.ArrayList;

/**
 * Created by roxy on 10/25/2014.
 * Main class for Baby
 */
public class Main {

    public static void main(String[] arguments) {


        Baby david = new Baby();

        david.name = "David";
        david.setMale(true);
        david.weight=3.0;
        david.decibels=100;
        david.poop();


    }
}
