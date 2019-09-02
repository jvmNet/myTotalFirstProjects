package mass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DoubleNumberMass {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> massNumber = new ArrayList<>();
        for(int i = 0; i < 10; i++) massNumber.add(i, Integer.parseInt(reader.readLine()));

        ArrayList<Integer> massDoubleNUmber = new ArrayList<>();
        Set<Integer> setNumber = new HashSet<>();
        setNumber.addAll(massNumber);

        int countDoubleNumber = 0;
        for(Integer mass: setNumber) {
            for(int doubleNumber = 0; doubleNumber < massNumber.size(); doubleNumber++){
                if(mass.equals(massNumber.get(doubleNumber))) countDoubleNumber++;
            }
            if(countDoubleNumber > 1){
                for(int i = 0; i < countDoubleNumber; i++) massDoubleNUmber.add(mass);
            }
            countDoubleNumber = 0;
        }

        for(Integer mass: massDoubleNUmber) System.out.println(mass);
    }
}
