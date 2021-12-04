package com.Lokesh.Recursion.Subsets;

import java.util.Scanner;

public class SkipString {
    public static void main(String[] args) {
//        String text = "This is apple";
//        skipString("This is apple");
        Scanner s= new Scanner(System.in);
        String skip = s.nextLine();
        System.out.println(skipString(skip, "This is apple"));
    }
    static String skipString(String skip, String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(skip)){
            return skipString(skip, up.substring(skip.length()));
            //ignoring length of string that need to be skipped.
        }else{
            return up.charAt(0)+skipString(skip,up.substring(1));
        }
    }
}