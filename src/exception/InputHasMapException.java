package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class InputHasMapException {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while(true) {
            int number;
            String text;
            try {
                number = Integer.parseInt(reader.readLine());
                text = reader.readLine();
            } catch (NumberFormatException e) {
                break;
            }

            map.put(text, number);
        }

        for(HashMap.Entry<String, Integer> mass: map.entrySet()) System.out.println(mass.getValue() + " " + mass.getKey());

    }
}
