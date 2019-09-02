package mass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DubleElementMass{
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list_number = new ArrayList<Integer>();
        ArrayList<Integer> list_double_number = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++) list_number.add(Integer.parseInt(reader.readLine()));

        int count = 1;
        int iterator = 0;
        for(int ext_i = iterator; ext_i < list_number.size() - 1; ext_i++){
            for(int i = iterator; i < list_number.size() - 1; i++){
                iterator++;
                if(list_number.get(i) == list_number.get(i + 1)){
                    count++;
                }else
                    break;
            }
            if(count > 1){
                list_double_number.add(count);
                count = 1;
            }
        }
        for(int e1 = 0; e1 < list_double_number.size(); e1++){
            int min = list_double_number.get(e1);
            int iMin = e1;
            for(int e2 = e1; e2 < list_double_number.size();e2++){
                if(list_double_number.get(e2) < min){
                    min = list_double_number.get(e2);
                    iMin = e2;
                }
            }if(e1 != iMin){
                list_double_number.add(e1,list_double_number.remove(iMin));
            }
        }


        for(Integer masive: list_double_number) System.out.print(masive + " ");
    }
}
