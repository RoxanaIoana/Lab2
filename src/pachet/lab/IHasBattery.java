package pachet.lab;

/**
 * Created by roxy on 11/1/2014.
 * O interfata pentru jucariile care au baterie
 */
public interface IHasBattery {


    /** Metoda pentru a verifica daca o jucarie are sau nu baterii */
    public boolean hasBattery(String name);

    /** Metoda pentru a verifica daca o jucarie merge  */
    public boolean works(String name) throws BatteryException;




}
