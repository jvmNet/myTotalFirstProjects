package randomClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNoDoubleNumber {
    private StringBuilder randomNumber;

    public StringBuilder getRandomNumber() {
        return randomNumber;
    }

    public RandomNoDoubleNumber(int lengthNumber){
        Set<Integer> setNumber = new LinkedHashSet<>();
        randomNumber = new StringBuilder();

        boolean check = true;
        while(check){
            int randomNum = (int)Math.round(Math.random()*9);
            if(randomNum != 0)
                setNumber.add(randomNum);
            if(setNumber.size() == lengthNumber)
                check = false;
        }
        for(Integer mass: setNumber) randomNumber.append(mass);
        randomNumber.substring(0, lengthNumber);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lengthUserNumber = 0;
        try{
            System.out.print("Enter size random computer number: ");
            lengthUserNumber = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        for(int i = 0; i < 5000; i++) {
            try{
                Thread.sleep(500);
                System.out.println(new RandomNoDoubleNumber(lengthUserNumber).getRandomNumber());
            } catch (Exception error){
                System.out.println("Error");
            }
        }
    }
}
