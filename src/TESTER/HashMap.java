package TESTER;

import java.util.HashMap;
public class ArrayDecleration {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1,"Lokesh");
        hm.put(2,"Loki");
        hm.put(3,"lok");
        hm.put(4,"lo");

        System.out.println(hm.isEmpty());
        System.out.println(hm.toString());

        hm.get(1);
        System.out.println(hm.get(1));
        HashMap<Integer,String> hm2 = new HashMap<>(hm);
        System.out.println(hm2.toString());


        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("lok"));


    }
}