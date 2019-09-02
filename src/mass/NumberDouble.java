package mass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberDouble {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> massNumber = new ArrayList<>();

        while (massNumber.size() < 3){
            massNumber.add(Integer.parseInt(reader.readLine()));
        }

        int count = 0;
        for(int i = 0; i < massNumber.size(); i++){
            for(int j = 0; j < massNumber.size() - 1; j++){
                if(massNumber.get(i).equals(massNumber.get(j + 1))) count++;
            }
            if(count > 1) {
                System.out.print(massNumber.get(i) + " ");
            } else
                count = 0;
        }
    }
}
