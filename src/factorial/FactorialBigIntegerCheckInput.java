package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FactorialBigIntegerCheckInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = 0;

        while(true) {
            input = Integer.parseInt(reader.readLine());

            if(input <= 51000) {
                break;
            } else {
                System.out.println("Введите число меньше либо равно 150");
            }
        }

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        StringBuilder factorial = new StringBuilder();

        if(n == 0) {
            return "1";
        } else if(n < 0) {
            return "0";
        } else {

            BigInteger result = BigInteger.valueOf(1);
            for(int i = 1; i <= n; ++i) {
                result = result.multiply(BigInteger.valueOf(i));
                System.out.println(i + ". " + i + " * " + result + " = " + result);
            }

            factorial.append(result);
            System.out.println(String.valueOf(result).length());
        }



        return factorial.toString();
    }
}

/*
    static void isAlive(long n){
        BigInteger day = BigInteger.ZERO;
        BigInteger next_day = BigInteger.ONE;
        BigInteger life = BigInteger.ONE;

        do{
            System.out.println(life);
            life = day.add(next_day);
            day = next_day;
            next_day = life;
            if(life.toString().length() > n) break;
        } while(true);
    }
   */
