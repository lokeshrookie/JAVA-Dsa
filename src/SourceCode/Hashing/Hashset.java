package SourceCode.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Character> hashSet  = new HashSet<>();
        String s = "Hello";
        for(int i = 0; i<s.length(); i++){
            hashSet.add(s.charAt(i));
        }
        System.out.println(Arrays.toString(hashSet.toArray()));

        for (Character character : hashSet) {
            System.out.println(character + " ");
        }

    }

}
