package com.Lokesh.Recursion.SubString;

import java.util.Scanner;

public class SkipString {
    public static void main(String[] args) {
//        String text = "This is apple";
//        skipString("This is apple");
        Scanner s= new Scanner(System.in);
//        String skip = s.nextLine();
        System.out.println(skipString(" ","This is apple apps in the apple phone"));
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

    /*
        remove app not apple: if the string starts with app and not apple,
        then remove app.

        Example: "This is apple apps in the apple phone" In this string, "app" will be romevod.
                    But apple and apple in the string will remain same.
     */
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){ // ! used.
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }
}