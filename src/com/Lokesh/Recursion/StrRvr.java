package com.Lokesh.Recursion;

import java.util.Scanner;

public class StrRvr {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        if(s == ""){
            return  "";
        }
        return  reverse(s.substring(1)) + s.charAt(0);
    }
}
