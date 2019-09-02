package multithreading.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private static List<Integer> listNumber = new ArrayList<>();

    private static int number = 0;

    private static boolean isStopped = false;

    public static void main(String[] args) {

       Plane plane1 = new Plane("Plane 1");
       Plane plane2 = new Plane("Plane 2");
       Plane plane3 = new Plane("Plane 3");

        //runProc();

    }

    private static void waiting() {
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    private static void runProc() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                initMass();
                System.out.println(number);

            }
        }).start();

    }

    private static void initMass() {
        waiting();

        number++;
        listNumber.add(number);

    }

}
