package mass.hashMap;

import java.util.HashMap;


public class PopulationCount {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Березуцкий","Иван");
        map.put("Петров","Петр");
        map.put("Луценко","Александр");
        map.put("Мироненко","Роман");
        map.put("Порошенко","Дмитрий");
        map.put("Коновалов","Виктор");
        map.put("Сидоров","Антон");
        map.put("Калиниченко","Роман");
        map.put("Иванов","Денис");
        map.put("Вербовой","Дмитрий");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int countFirstName = 0;
        for(HashMap.Entry<String, String> firstNameMap: map.entrySet()){
            String value = firstNameMap.getValue();
            if(value.equals(name)){
                countFirstName++;
            }
        }
        return countFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int countLastName = 0;
        for(HashMap.Entry<String, String> lastNameMap: map.entrySet()){
            String key = lastNameMap.getKey();
            if(key.equals(lastName)){
                countLastName++;
            }
        }
        return countLastName;
    }

    public static void main(String[] args) {

        System.out.println(getCountTheSameFirstName(createMap(),"Виктор"));

    }
}
