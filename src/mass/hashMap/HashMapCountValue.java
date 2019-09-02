package mass.hashMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCountValue {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> word = new ArrayList<String>();
        for(int i = 0; i < 10; i++) word.add(reader.readLine());

        HashMap<String, Integer> map = createMap(word);
        for(HashMap.Entry<String, Integer> masive: map.entrySet()){
            System.out.println(masive.getKey() + " " + masive.getValue());
        }

    }
    public static HashMap<String, Integer> createMap(ArrayList<String> word){
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for(String masiveWord: word){
            if(result.containsKey(masiveWord)){
                result.put(masiveWord, result.get(masiveWord) + 1);
            } else{
                result.put(masiveWord, 1);
            }
        }
        return result;
    }
}
