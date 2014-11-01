package pachet.lab;

/**
 * Created by roxy on 11/1/2014.
 * Clasa care extinde clasa Exception
 */
public class BatteryException extends Exception {


    /** Daca o jucarie are baterii dar nu merge, se va arunca o exceptie */
    public BatteryException(String message) {

        super(message);

    }


}
