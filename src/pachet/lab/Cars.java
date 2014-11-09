package pachet.lab;

/**
 * Created by roxy on 11/1/2014.
 * O clasa Cars care extinde clasa Toys
 */
public class Cars extends Toys implements IHasBattery {

    /**
     * Membru al clasei care indica daca jucaria are baterii sau nu
     */
    private boolean battery;

    /**
     * Constructorul default
     */
    public Cars(String tName) {
        super(tName);
    }

    @Override
    /** Metoda setToyName care apeleaza cu ajutorul lui super, metoda setToyName din clasa de baza */
    public void setToyName(String tName) {
        super.setToyName(tName);
    }

    @Override
    /** Metoda abstracta din clasa de baza, am suprascris-o aici si indica daca jucaria este pentru fete sau baieti*/
    public void forGirlsOrBoys(String name) {

        System.out.println(name + " is for boys because is a car ");

    }

    public void setBattery(String name) {

       this.battery=true;
    }

    @Override
    /** Metoda din interfata IHasBattery implementata in aceasta clasa care spune daca o jucarie are baterii*/
    public boolean hasBattery(String name) {

        if (battery) {
            System.out.println(name + " has battery");

            return true;
        } else {
            System.out.println(name + " has no battery");

            return false;
        }
    }

    @Override
    /** Metoda din interfata IHasBattery implementata in aceasta clasa
     * verifica daca o jucarie este functionala*/
    public boolean works(String name) throws BatteryException {

        if (getToyName() == null)
            throw new BatteryException("The name of the toy is invalid");


        if (hasBattery(name)) {

            System.out.println(name + " works");
            return true;
        } else {

            throw new BatteryException("The car doesn't work");


        }


    }

}
