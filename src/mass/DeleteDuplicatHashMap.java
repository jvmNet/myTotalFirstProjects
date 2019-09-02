package mass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteDuplicatHashMap {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Petr");
        map.put("Petrov", "Ivan");
        map.put("StalLone", "Grigorii");
        map.put("Sidorov", "Timur");
        map.put("Nihternov", "Ivan");
        map.put("Samsonov", "Stepan");
        map.put("Militon", "Mihail");
        map.put("Radchenko", "Ivan");
        map.put("Trockiy", "Petr");
        map.put("Coperman", "Grigorii");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        List<String> copyValues = new ArrayList<>(map.values());

        for(String name: copyValues){

            int count = 0;
            for(String nameDuplicate: copyValues){
                if(name.equals(nameDuplicate)) count++;
                if(count > 1) removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


        HashMap<String, String> map = createMap();

        removeTheFirstNameDuplicates(map);

        for(HashMap.Entry<String, String> pair: map.entrySet()) System.out.println(pair.getKey() + " - " + pair.getValue());

    }
}
