package TESTER;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
public class ArrayDecleration {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
//        hm.isEmpty();
        hm.put(1,"Lokesh");
        hm.put(2,"Loki");
        hm.put(3,"lok");
        hm.put(4,"lo");
        hm.isEmpty();
        System.out.println(hm.isEmpty());
        System.out.println(hm.toString());

        hm.get(1);
        System.out.println(hm.get(1));
        HashMap<Integer,String> hm2 = new HashMap<>(hm);
        System.out.println(hm2.toString());
        hm.containsKey(1);
        hm.containsValue("lok");

        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("lok"));


    }
}