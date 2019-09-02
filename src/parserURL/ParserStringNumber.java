package parserURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParserStringNumber {
    private static List<String> stringList = null;
    private static List<Double> doubleList = null;
    private static StringBuilder sb = null;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = reader.readLine();

        char[] text = inputText.toCharArray();

        stringList = new ArrayList<String>();
        doubleList = new ArrayList<Double>();
        sb = new StringBuilder();

        for(int i = 0; i < text.length; i++) {
            if(beginCheckLetter(text[i])) {
                for(int b = i + 1; b < text.length; b++) {
                    if(alphaBet(text[b]) || numberFormat(text[b])) {
                        sb.append(text[b]);
                    } else {
                        if(checkDoubleText(sb.toString())) {
                            doubleList.add(Double.parseDouble(sb.toString()));
                        } else {
                            if(checkStringText(sb.toString()))
                                stringList.add(sb.toString());
                        }
                        sb.delete(0, sb.length());
                        break;
                    }
                }
            }
        }

        if(!stringList.isEmpty()) {
            for(String mass: stringList) {
                sb.append(mass);
                sb.append(" ");
            }
            alert(sb.toString());
            sb.delete(0, sb.length());
        }

        if(!doubleList.isEmpty()) {
            for(Double mass: doubleList) {
                sb.append(mass);
                sb.append(" ");
            }
            alert(Double.parseDouble(sb.toString()));
            sb.delete(0, sb.length());
        }

        try{
            reader.close();
        } catch (IOException e) {
            System.out.println("stream not close!");
        }
    }

    public static boolean checkDoubleText(String word) {
        if(word.contains(".")) {
            try{
                Double.parseDouble(word);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else
            return false;
    }

    public static boolean checkStringText(String word) {
        try{
            Integer.parseInt(word);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static boolean beginCheckLetter(char letter) {
        char[] beginLetter = {'?', '&', '='};

        boolean check = false;
        for(int i = 0; i < beginLetter.length; i++) {
            if(letter == beginLetter[i])
                check = true;
        }
        return check;
    }

    public static boolean alphaBet(char letter) {
        char[] alphaBet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        boolean check = false;
        for(int i = 0; i < alphaBet.length; i++) {
            if(letter == alphaBet[i])
                check = true;
        }
        return check;
    }

    public static boolean numberFormat(char letter) {
        char[] numberFormat = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};

        boolean check = false;
        for(int i = 0; i < numberFormat.length; i++) {
            if(letter == numberFormat[i])
                check = true;
        }
        return check;
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
