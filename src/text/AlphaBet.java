package text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlphaBet {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for(int i = 0; i < alphabet.size(); i++ ){
            System.out.println(alphabet.get(i) + " " + countLetter(list, alphabet.get(i)));
        }

    }
    public static int countLetter(ArrayList<String> listText, char letter){
        StringBuilder allText = new StringBuilder();
        for(int i = 0; i < listText.size(); i++){
            allText.append(listText.get(i));
        }
        int countLetter = 0;
        for(int i = 0; i < allText.length(); i++){
            char textLetter = allText.charAt(i);
            if(textLetter == letter) countLetter++;
        }
        return countLetter;
    }
}
