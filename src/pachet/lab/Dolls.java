package pachet.lab;

/**
 * Created by roxy on 11/1/2014.
 * O clasa Dolls care extinde clasa Toys
 */
public class Dolls extends Toys implements IHasBattery {

    /** Constructorul default */
    public Dolls(String tName) {
        super(tName);
    }

    @Override
    /** Metoda din clasa de baza Toys, implementata pentru aceasta clasa
     * indica daca jucaria este pentru fete sau baieti
      */
    public void forGirlsOrBoys(String name) {

        System.out.println(name + " is for girls because is a doll ");

    }


    @Override
    /** Metoda din interfata IHasBattery implementata pentru clasa Dolls */
    public boolean hasBattery(String name) {


        System.out.println("Dolls doesn't have batteries");

            return false;

    }

    @Override
    public boolean works(String name) throws BatteryException {


        hasBattery(name);

        if (getToyName() == null)
            throw new BatteryException("The name of the toy is invalid");

      return true;


    }
}
