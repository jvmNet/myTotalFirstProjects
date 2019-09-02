package text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlphaBetTwoVariant {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        StringBuilder sbAllMass = new StringBuilder();
        for(int i = 0; i < list.size(); i++) sbAllMass.append(list.get(i));

        ArrayList<String> result = new ArrayList<>();

        int countLetter = 0;
        for(int i = 0; i < abcArray.length; i++) {
            char alphabetLetter = abcArray[i];
            for(int j = 0; j < sbAllMass.length(); j++) {
                if(alphabetLetter == sbAllMass.charAt(j)) {
                    countLetter++;
                }
            }
            result.add(alphabetLetter + " " + countLetter);
            countLetter = 0;
        }

        for(String mass: result) System.out.println(mass);

    }
}
