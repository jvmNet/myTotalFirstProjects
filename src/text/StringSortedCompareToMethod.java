package text;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringSortedCompareToMethod {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for(int element1 = 0; element1 < array.length; element1++){
            String min = String.valueOf(array[element1].charAt(0)).toLowerCase();
            int index = element1;
            for(int element2 = element1; element2 < array.length; element2++){
                String letterElement2 = String.valueOf(array[element2].charAt(0)).toLowerCase();
                if(isGreaterThan(min, letterElement2)){
                    min = letterElement2;
                    index = element2;
                }
            }
            if(element1 != index) {
                String temp = array[index];
                array[index] = array[element1];
                array[element1] = temp;
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
