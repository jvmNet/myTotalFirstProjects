package thinkingJava.part5;

import java.util.Arrays;

public class ArrayCreatArray {
    public static void main(String[] args) {

        Integer[] massFirst = {
                new Integer(5),
                new Integer(3),
                7,
        };

        Integer[] massSecond = {
                new Integer(11),
                new Integer(3),
                9
        };

        System.out.println(Arrays.toString(massFirst));
        System.out.println(Arrays.toString(massSecond));

    }
}
