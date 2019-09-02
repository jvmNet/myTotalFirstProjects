package mass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestMassSorted {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mass = new ArrayList<>();
        for(int i = 0; i < 10; i++) mass.add(Integer.parseInt(reader.readLine()));

        for(int i = mass.size(); i > 0; i--){
            boolean check = true;
            for(int j = 0; j < mass.size() - 1; j++){
                if(mass.get(j) > mass.get(j + 1)){
                    mass.add(j, mass.remove(j + 1));
                    check = false;
                }
            }
            if(check) break;
        }


       for(Integer masive: mass) System.out.println(masive + " ");

    }
}
