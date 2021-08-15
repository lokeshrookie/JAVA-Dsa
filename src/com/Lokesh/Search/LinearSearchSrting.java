package com.Lokesh.Search;

import java.util.Arrays;

public class LinearSearchSrting {
    public static void main(String[] args) {
        String name = "Lokesh";
        char target = 'L';
       System.out.println(linearSearch(name, target));
       System.out.println("String as Char array: " + Arrays.toString(name.toCharArray()));
        // if Arrays.toString is not used, output will be address of an array : [C@2d98a335

    }
    static boolean  linearSearch(String str , char target){ // we can change the name of target.
        if(str.length() == 0){
            return false;
        } // return false if the string is empty.

        for (int i =0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true; // return true if target matched with any element in the string str.
            }
        }
        return  false; // return false if no any above conditions are satisfied. i.e., not found.
    }
    static boolean  linearSearch2(String str , char target){ // we can change the name of target.
        if(str.length() == 0){
            return false;
        } // return false if the string is empty.

        // string.toCharArray() converts string to Character Array.
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return  false; // return false if no any above conditions are satisfied. i.e., not found.
    }
}
