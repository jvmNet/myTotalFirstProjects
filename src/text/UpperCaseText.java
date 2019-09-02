package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Date;



public class UpperCaseText {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        List<String> listWord = new ArrayList<String>();
        int startIndexWord = 0;
        int iterator = 0;
        for (int ext_i = iterator; ext_i < s.length(); ext_i++) {
            for (int i = iterator; i < s.length(); i++) {
                iterator++;
                char empty = ' ';
                char letter = s.charAt(i);
                if (letter == empty) break;
            }
            String element = s.substring(startIndexWord, iterator);
            if(element.isEmpty()){
                element = "";
                listWord.add(element);
            }else{
                listWord.add(element.substring(0, 1).toUpperCase() + element.substring(1));
                startIndexWord = iterator;
            }
        }
        for(String masive: listWord) System.out.print(masive);
    }
}
