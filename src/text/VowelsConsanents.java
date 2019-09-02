package text;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VowelsConsanents {
    public static char[] vowels = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
    public static char[] consanents = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    public static char[] point = {'.',','};
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        List listVawels = new ArrayList<>();
        List listConsanent = new ArrayList<>();
        List listPoint = new ArrayList<>();
        for(int i = 0; i < text.length(); i++){
            char let = text.charAt(i);
            if(isVowel(let)) listVawels.add(let);
            if(isConsanent(let)) listConsanent.add(let);
            if(isPoint(let)) listPoint.add(let);
        }
        getInfo(listVawels);
        getInfo(listConsanent);
        getInfo(listPoint);
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        for(Character massVowels: vowels){
            if(massVowels == c) return true;
        }
        return false;
    }
    public static boolean isConsanent(char c){
        c = Character.toLowerCase(c);
        for(Character massConsanents: consanents){
            if(massConsanents == c) return true;
        }
        return false;
    }
    public static boolean isPoint(char c){
        for(Character massPoint: point){
            if(massPoint == c) return true;
        }
        return false;
    }
    public static void getInfo(List list){
        for(Object masive: list) System.out.print(masive + " ");
        System.out.println();
    }
}
