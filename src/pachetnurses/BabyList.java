package pachetnurses;

import java.util.HashMap;

/**
 * Created by roxy on 10/25/2014.
 * In aceasta clasa folosesc HashMap pentru a face legatura intre un bebelus si asistenta sa
 */
public class BabyList {

    HashMap<String, String> nurseAndBaby = new HashMap<String, String>();

    /** functia set pentru stabilirea valorilor */
    public void setNurseAndBaby(HashMap<String, String> nurseAndBaby) {

        this.nurseAndBaby = nurseAndBaby;
    }

    /** functia get pentru a obtine valorile */
    public HashMap<String, String> getNurseAndBaby() {

        return nurseAndBaby;
    }


}
