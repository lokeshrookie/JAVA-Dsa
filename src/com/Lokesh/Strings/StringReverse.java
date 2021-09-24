package com.Lokesh.Strings;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Telugu";
        for (int i = s.length()-1; i >=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
