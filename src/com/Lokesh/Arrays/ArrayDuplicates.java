package com.Lokesh.Arrays;

import com.Lokesh.Hashing.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,6,7,3,9};
//        System.out.println(dup(arr));
        dup(arr);   // using hashset
        dups(arr); // ustyhing hashmap
    }
    private static void dup(int[] arr) {
        HashSet<Integer>  hs = new HashSet<>();
        String dup = "";
        for(int i = 0; i<arr.length; i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
            else{
                dup = dup  + " " +  arr[i];
            }
        }
        System.out.println("Duplicate elements are : "  + dup);
        System.out.println("Unique elements are :" + hs.toString());
    }

    static void dups(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }
            else{
                hm.put(i,hm.get(i)+1);
            }
        }
        System.out.println(hm);
    }
}
