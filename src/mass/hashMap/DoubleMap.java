package mass.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class DoubleMap {
    public static void main(String[] args) {

        int[] mass = {4,5,7,8,4,4,4,5,7,3,2,2,2,3,5,8,9,9,9,4,3,4,6,4,3,4,5,5};

        HashMap<String, String> map = new HashMap<>();

        map.put("Сидоров","Иван");
        map.put("Петров","Петр");
        map.put("Луценко","Александр");
        map.put("Иванов","Роман");
        map.put("Порошенко","Дмитрий");
        map.put("Коновалов","Виктор");
        map.put("Сидоров","Антон");
        map.put("Калиниченко","Роман");
        map.put("Иванов","Денис");
        map.put("Петров","Дмитрий");

        String lastName = "Сидоров";
        String firstName = "Дмитрий";

        int countFirstName = 0;
        int countLastName = 0;
        for(HashMap.Entry<String, String> element: map.entrySet()){

            String key = element.getKey();
            String value = element.getValue();

            if(key.equals(lastName)) countLastName++;
            if(value.equals(firstName)) countFirstName++;

        }

        System.out.println(countFirstName);
        System.out.println(countLastName);

    }
}
