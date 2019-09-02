package thinkingJava.part5;

import java.util.Arrays;
import java.util.Random;

public class ArrayNewInitialized {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] mass = new Integer[random.nextInt(50)];

        System.out.println("length mass: " + mass.length);

        for(int i = 0; i < mass.length; i++) mass[i] = random.nextInt(500);

        System.out.println(Arrays.toString(mass));

    }
}
