package mass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorRemoveInteger {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Иванов Иван", 705);
        map.put("Петров Петр", 1255);
        map.put("Колесник Евгений", 492);
        map.put("Коновалов Руслан", 1575);
        map.put("Калиниченко Дмитрий", 350);
        map.put("Зинченко Юрий", 2755);
        map.put("Мамалат Дмитрий", 595);
        map.put("Богатырев Сергей", 259);
        map.put("Волков Евгений", 1755);
        map.put("Сидоров Андрей", 495);

        return map;
    }

    public static HashMap<String, Integer> removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap.Entry<String, Integer> element = iterator.next();
            String key = element.getKey();
            int value = element.getValue();
            if(value < 500) iterator.remove();
        }
        return map;
    }

    public static void getInfo(HashMap<String, Integer> mapInfo){
        for(HashMap.Entry<String, Integer> masive: mapInfo.entrySet()) System.out.println(masive.getKey() + " " + masive.getValue());
    }

    public static void main(String[] args) {

        getInfo(removeItemFromMap(createMap()));
    }
}
