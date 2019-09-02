package pattern.singletonPlanet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static String textExample;

    public static void main(String[] args) {

        System.out.println(thePlanet);

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {

        BufferedReader reader = null;

        try{

            reader = new BufferedReader(new InputStreamReader(System.in));
            textExample = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (textExample.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (textExample.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (textExample.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }

    }
}
