package com.Lokesh;

import com.Lokesh.Hashmaps.Hashmap;

import java.nio.CharBuffer;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        System.out.println(hashSet.contains(7));
        System.out.println(hashSet);
        System.out.println(hashSet.toString());
        System.out.println();

    }
}
