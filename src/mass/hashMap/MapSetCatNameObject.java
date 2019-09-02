package mass.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSetCatNameObject {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код

        HashMap<String, Cat> map = new HashMap<>();

        Cat cat1 = new Cat("Barsik");
        map.put(cat1.name, cat1);

        Cat cat2 = new Cat("Murzik");
        map.put(cat2.name, cat2);

        Cat cat3 = new Cat("Fargon");
        map.put(cat3.name, cat3);

        Cat cat4 = new Cat("Nilden");
        map.put(cat4.name, cat4);

        Cat cat5 = new Cat("Jony");
        map.put(cat5.name, cat5);

        Cat cat6 = new Cat("Lobzen");
        map.put(cat6.name, cat6);

        Cat cat7 = new Cat("Mentrik");
        map.put(cat7.name, cat7);

        Cat cat8 = new Cat("Xodex");
        map.put(cat8.name, cat8);

        Cat cat9 = new Cat("Zertok");
        map.put(cat9.name, cat9);

        Cat cat10 = new Cat("Snipy");
        map.put(cat10.name, cat10);

        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        Set<Cat> listCat = new HashSet<>();

        for(HashMap.Entry<String, Cat> mass: map.entrySet()) {

            listCat.add(mass.getValue());
        }

        return listCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
