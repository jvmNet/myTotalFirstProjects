package mass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MassDoubleSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> massDoubleNumber = new ArrayList<>();
        ArrayList<Integer> massNumber = new ArrayList<>();
        for(int i = 0; i < 10; i++) massNumber.add(i, Integer.parseInt(reader.readLine()));

        Set<Integer> massNoDouble = new HashSet<>();
        massNoDouble.addAll(massNumber);


        for(Integer mass: massNoDouble){
            int count = 0;
            for(int i = 0; i < massNumber.size(); i++){
                if(mass.equals(massNumber.get(i))) count++;
            }
            if(count > 1){
                for(int i = 0; i < count; i++) massDoubleNumber.add(mass);
            }
        }

        for(Integer mass: massDoubleNumber) System.out.println(mass);
    }
}
