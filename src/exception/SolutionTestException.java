package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class SolutionTestException {
    public static void main(String[] args){
        ArrayList<Integer> listNumber = null;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            listNumber = new ArrayList<Integer>();
            while(listNumber.add(Integer.parseInt(reader.readLine())));
        } catch (NumberFormatException e){
            for(Integer masive: listNumber) System.out.println(masive);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
