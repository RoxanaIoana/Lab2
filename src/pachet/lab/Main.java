package pachet.lab;

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
        david.weight = 3.0;

        /** am setat decibelii */
        david.decibels = 100;

        /** david trebuie schimbat */
        david.poop();

        /** am setat varsta lui david, 2 ani */
        david.setAge(2);

        System.out.println("The baby name is " + david.name);


        Toys toy = new Dolls("Barbie");
        Cars newCar = new Cars("Masina de politie");
        Dolls babyDoll = new Dolls(null);
        IHasBattery aCar = new Cars("Bmw");


        try {

            ((IHasBattery) toy).works("Ana");

        } catch (BatteryException e) {
            System.out.println("Exception : " + e.getMessage());
        }

        newCar.setBattery("Masina de politie");
        try {

            newCar.works("Masina de politie");

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }


        try {

            babyDoll.works(null);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }


        try {

            aCar.works("Bmw");
        } catch (BatteryException e) {
            System.out.println("Exception : " + e.getMessage());
        }


    }
}
