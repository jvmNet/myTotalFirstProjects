package mass.hashMap;

import java.util.*;

public class RemoveHashMapValue {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Березуцкий", "Иван");
        map.put("Петров", "Петр");
        map.put("Луценко", "Александр");
        map.put("Мироненко", "Роман");
        map.put("Порошенко", "Дмитрий");
        map.put("Коновалов", "Виктор");
        map.put("Сидоров", "Антон");
        map.put("Калиниченко", "Роман");
        map.put("Иванов", "Денис");
        map.put("Вербовой", "Дмитрий");


        ArrayList<String> copyValueMap = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (HashMap.Entry<String, String> copyMap : map.entrySet()) {
            copyValueMap.add(copyMap.getValue());
        }

        int iterator = 0;
        for (int ext_i = copyValueMap.size(); ext_i > 1; ext_i--) {
            for (int i = iterator; i < copyValueMap.size() - 1; i++) {
                if (copyValueMap.get(iterator).equals(copyValueMap.get(i + 1))) {
                    set.add(copyValueMap.get(iterator));
                }
            }
            iterator++;
        }

        for(String setName: set) removeItem(map, setName);



        for (HashMap.Entry<String, String> masive : map.entrySet())
            System.out.println(masive.getKey() + " " + masive.getValue());

    }
    public static void removeItem(HashMap<String, String> map, String value){
            HashMap<String, String> copy = new HashMap<>(map);
            for(HashMap.Entry<String, String> copyMap: copy.entrySet()){
                if(copyMap.getValue().equals(value)){
                    map.remove(copyMap.getKey());
                }
            }
    }

}
