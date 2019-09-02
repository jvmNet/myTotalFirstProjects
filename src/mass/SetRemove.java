package mass;

import java.util.HashSet;
import java.util.Iterator;

public class SetRemove {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 20; i++) set.add(i);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> setRemove = new HashSet<Integer>();
        Iterator<Integer> iterator = set.iterator();
        for(int i = 0; i < set.size(); i++){
            int element = iterator.next();
            if(element > 10) setRemove.add(element);
        }
        set.removeAll(setRemove);
        return set;
    }

    public static void main(String[] args) {

        for(Integer masive: removeAllNumbersMoreThan10(createSet())) System.out.print(masive + " ");
    }
}
