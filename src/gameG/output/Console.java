package gameG.output;

import java.util.List;

public class Console {
    public void output(final String file){
        System.out.println(file);
    }

    public void output(final List<String> mass){
        for(int i = 0; i < mass.size(); i++){
            System.out.println(mass.get(i));
        }
    }

    public static void printText(final String text){
        System.out.println(text);
    }

    public static void printText(final int age){
        System.out.println(age);
    }
}
