package mass.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapSet {
    public static void main(String[] args){

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(5, "Vasya");
        map.put(10, "Petya");
        map.put(15, "Nill");

        for(Map.Entry<Integer, String> mass: map.entrySet()) System.out.println(mass.getKey() + " " + mass.getValue());

    }
}
