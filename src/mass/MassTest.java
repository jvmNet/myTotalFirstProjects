package mass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MassTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mass = new ArrayList<>();

        for(int i = 0; i < 10; i++) mass.add(Integer.parseInt(reader.readLine()));

        System.out.println("размер массива = " + mass.size());

        mass.remove(3);
       // mass.remove(6);
       // mass.remove(7);


        System.out.println("размер массива = " + mass.size());

        for(int i = mass.size() - 1; i >= 0; i--) {
            mass.add(4,999);
        }


/*
        for(int i = mass.size() - 1; i >= 0; i--){
            mass.add(i, mass.get(i));
        }
*/
        for(Integer masive: mass) System.out.println(masive);

    }
}
