package mass.sorted;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortedMassStringAndInteger {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> massNumber = new ArrayList<>();
        ArrayList<String> massString = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            String element = array[i];
            if(isNumber(element)) {
                massNumber.add(Integer.parseInt(element));
            } else {
                massString.add(element);
            }
        }

        for(int i = massNumber.size(); i > 0; i--) {
            boolean check = true;
            for(int j = 0; j < massNumber.size() - 1; j++) {
                if(massNumber.get(j) < massNumber.get(j + 1)) {
                    massNumber.add(j, massNumber.remove(j + 1));
                    check = false;
                }
            }
            if(check) break;
        }

        for(int i = massString.size(); i > 0; i--) {
            boolean check = true;
            for(int j = 0; j < massString.size() - 1; j++) {
                if(isGreaterThan(massString.get(j).toLowerCase(), massString.get(j + 1).toLowerCase())) {
                    massString.add(j, massString.remove(j + 1));
                    check = false;
                }
            }
            if(check) break;
        }

        int countMassNumber = 0;
        int countMassString = 0;
        for(int i = 0; i < array.length; i++) {
            String element = array[i];
            if(isNumber(element)) {
                array[i] = String.valueOf(massNumber.get(countMassNumber));
                countMassNumber++;
            } else {
                array[i] = massString.get(countMassString);
                countMassString++;
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') || (!Character.isDigit(c) && c != '-')) {
                return false;
            }
        }
        return true;
    }
}
