package SourceCode.Hashing;

import java.util.HashMap;
import java.util.Map;


public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String > hashMap = new HashMap<>();
        hashMap.put(0,"Zero");
        hashMap.put(1, "One");
        System.out.println(hashMap.get(null));
        hashMap.put(null, null);
        System.out.println(hashMap.containsKey(1) + " Contains key");
        System.out.println(hashMap.containsValue("Two") + " Contains value");
        System.out.println(hashMap.hashCode() + " This is hashCode");
        System.out.println( " keySet is  " + hashMap.keySet());
        System.out.println("EntrySet  is " + hashMap.entrySet());
        System.out.println(hashMap.values());
//        System.out.println(hashMap.clear());
        hashMap.clear();
        System.out.println(hashMap);
    }
}
