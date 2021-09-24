package com.Lokesh.Strings;

public class StringReverseEveryWord {
    public static void main(String[] args) {
        String s = "This is loki";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}