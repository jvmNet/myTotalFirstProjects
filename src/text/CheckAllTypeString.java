package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckAllTypeString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while(!(line = reader.readLine()).equals("exit")) {

            try{

                if(line.contains(".")) {
                    double numberDouble = Double.parseDouble(line);
                    print(numberDouble);
                }

                int number = Integer.parseInt(line);

                if(number > 0 && number < 128) {
                    print((short) number);
                } else {
                    print(number);
                }


            } catch (NumberFormatException e) {
                if(checkString(line)) print(line);
            }

        }
    }

    public static boolean checkString(String line) {
        try {
            Double.parseDouble(line);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
