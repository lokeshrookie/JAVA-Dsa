package com.Lokesh.Recursion.Subsets;

public class SkipString {
    public static void main(String[] args) {
//        String text = "This is apple";
//        skipString("This is apple");
        System.out.println(skipString("This is apple"));
    }

    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
            //ignoring length of string that need to be skipped.
        }else{
            return up.charAt(0)+skipString(up.substring(1));
        }
    }
}