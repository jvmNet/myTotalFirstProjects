package parserURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParserURL {

    private static BufferedReader reader = null;
    private static String textURL = null;
    private static String[] partsTextURL = null;
    private static List<String> result = null;

    static {
        reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            textURL = reader.readLine();
        } catch (IOException e) {
            System.out.println("TextURL not reader");
        }
    }

    public static void main(String[] args) {
        partsTextURL = textURL.substring(textURL.indexOf("?") + 1).split("&");

        result = new ArrayList<String>();
        String value = null;
        for(int i = 0; i < partsTextURL.length; i++) {
            if(partsTextURL[i].contains("obj"))
                value = partsTextURL[i].substring(4);

            if(partsTextURL[i].contains("=")) {
                result.add(partsTextURL[i].substring(0, partsTextURL[i].indexOf("=")));
            } else {
                result.add(partsTextURL[i]);
            }
        }

        for(String mass: result) System.out.print(mass + " ");

        System.out.println();

        if(value != null) {
            try {
                alert(Double.parseDouble(value));
            } catch (NumberFormatException e) {
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
