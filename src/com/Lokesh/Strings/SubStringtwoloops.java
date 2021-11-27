package com.Lokesh.Strings;

/**
 *
 * two for loops
 * first loop(i) for starting point
 *  substring = "";
 * second loop (j) is for printing the substring.
 * substring += string.charAt(j);
 */

public class SubStringtwoloops {
    public static void main(String[] args) {
        String s= "Loki";
        sub(s);

    }
    static void sub(String s){
        for(int i = 0; i<s.length(); i++){
            String  str  = ""; // empty string to
            for(int j  = i; j<s.length(); j++){
                str = str + s.charAt(j);
                System.out.println(str);
            }
        }
    }
}