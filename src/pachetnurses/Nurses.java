package pachetnurses;

/**
 * Created by roxy on 10/25/2014.
 * In aceasta clasa asociez o asistenta cu un bebelus
 */
public class Nurses {

    public static void main(String[] arguments) {

        BabyList babyList = new BabyList();

        babyList.nurseAndBaby.put("david", "ana");
        babyList.nurseAndBaby.put("carla", "andreea");


        /** afisez toti bebelusii */
        for (String bb : babyList.nurseAndBaby.keySet()) {


            System.out.println("Baby : " + bb);
        }

        /** afisez toate asistentele */
        for (String b : babyList.nurseAndBaby.values()) {
            System.out.println("Nurse : " + b);

        }

    }

}
