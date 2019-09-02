package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TextUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код

        List<String> result = new ArrayList<>();

        int countLetter = 0;
        int beginWord = 0;
        for(int i = beginWord; i < s.length(); i++){

            for(int j = countLetter; j < s.length(); j++){
                char letter = s.charAt(j);
                char empty = ' ';
                countLetter++;
                if(letter == empty) break;
            }
            if(beginWord < s.length()) result.add(s.substring(beginWord, beginWord + 1).toUpperCase() + s.substring(beginWord + 1, countLetter));
            beginWord = countLetter;
        }

        for(String mass: result) System.out.print(mass);

    }
}
