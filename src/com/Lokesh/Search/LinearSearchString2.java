package com.Lokesh.Search;

public class LinearSearchString2 {
    public static void main(String[] args) {
        String str = "Lokesh";
        char target = 'i';
        System.out.println(linearSearchMethod(str, target));
    }
    static Boolean linearSearchMethod(String s, char c){
        if(s.length() == 0){
            return false;
        }
        // for (int i : s.toCharArray()) {
        //     if(c == s.charAt(i)){
        //         return true;
        //     }
        // }
        for (int i = 0; i <s.length(); i++) {
            if(c == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
