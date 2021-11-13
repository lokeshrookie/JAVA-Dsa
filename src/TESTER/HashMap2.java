package TESTER;

import java.util.HashMap;
public class HashMap2 {

    public static void main(String[] args) {
        java.util.HashMap<Integer,String> hm = new java.util.HashMap<>();

        hm.put(1,"Lokesh");
        hm.put(2,"Loki");
        hm.put(3,"lok");
        hm.put(4,"lo");

        System.out.println(hm.isEmpty());
        System.out.println(hm.toString());

        hm.get(1);
        System.out.println(hm.get(1));
        java.util.HashMap<Integer,String> hm2 = new java.util.HashMap<>(hm);
        System.out.println(hm2.toString());


        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("lok"));


    }
}