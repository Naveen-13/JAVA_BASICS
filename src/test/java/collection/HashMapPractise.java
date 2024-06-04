package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractise {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("one", 1);
        hs.put("two", 2);
        hs.put("three", 3);
       Set<Map.Entry<String, Integer>> sets = hs.entrySet();

       for(Map.Entry<String, Integer> set:sets ){
        System.out.println(set.getKey() + " " + set.getValue());
       }
    }
}
