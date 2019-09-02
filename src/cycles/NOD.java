package cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;

        while(true) {
            try{
                a = Integer.parseInt(reader.readLine());
                if(a < 0)
                    throw new NumberFormatException();

            } catch (NumberFormatException e) {
                System.out.println("Введите положительное число - a!");
            }

            if(a > 0) break;
        }

        while(true) {
            try{
                b = Integer.parseInt(reader.readLine());
                if(b < 0)
                    throw new NumberFormatException();

            } catch (NumberFormatException e) {
                System.out.println("Введите положительное число - b!");
            }

            if(b > 0) break;
        }

        int result = nod(a, b);

        System.out.println(result);
    }

    public static int nod(int a, int b) {

        while((a != 0) && (b != 0)) {

            if(a > b) {
                a = a%b;
            } else {
                b = b%a;
            }
        }

        return a + b;
    }
}
