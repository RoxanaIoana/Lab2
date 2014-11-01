package pachet.lab;

/**
 * Created by roxy on 11/1/2014.
 *  O clasa abstracta pentru jucarii
 */
public abstract class Toys {

    /** Numele jucariei */
    private String toyName;



    /** Constructorul default */
    public Toys(String tName, int ageC ) {
        this.toyName=tName;
    }

    /** Metoda pentru a seta numele unei jucarii */
    public void setToyName(String tName) {
        this.toyName=tName;

    }

    /** Metoda pentru a returna numele unei jucarii */
    public String getToyName() {
        return toyName;
    }


    /** Functie abstracta care trebuie sa fie suprascrisa de toate subclasele
     * Parametrul name reprezinta numele jucariei
     * */
    public abstract void forGirlsOrBoys(String name);



}
