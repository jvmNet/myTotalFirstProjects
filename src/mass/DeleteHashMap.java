package mass;

import java.util.HashMap;

public class DeleteHashMap {
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Grigoriy", 572);
        map.put("Kirov", 784);
        map.put("Linked", 950);



        map.put("key", 45);

        int[] massOne = new int[] {12, 45, 67, 23, 89};
        for(int i = 0; i < massOne.length; ){

        }

        for(HashMap.Entry<String, Integer> pair: map.entrySet()){

            if(pair.getValue() < 700) map.remove(pair.getKey());

        }

        for(HashMap.Entry<String, Integer> mass: map.entrySet())
            System.out.println(mass.getKey() + " - " + mass.getValue());
    }
}
