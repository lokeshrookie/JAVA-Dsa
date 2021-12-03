package com.Lokesh.Recursion.Permutations;

/**
 * Processed and Unprocessed.
 */
public class Main {
    public static void main(String[] args) {
        permutations("", "abc");
//        System.out.println(permutations("", "abc"););
    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

}


