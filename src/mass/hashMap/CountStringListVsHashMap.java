package mass.hashMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountStringListVsHashMap {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for(String massList: list) result.put(massList, null);

        int countString = 0;
        for(HashMap.Entry<String, Integer> massMap: result.entrySet()) {
            for(String massList: list) {
                if(massMap.getKey().equals(massList)) countString++;
            }
            massMap.setValue(countString);
            countString = 0;
        }

        return result;
    }
}
