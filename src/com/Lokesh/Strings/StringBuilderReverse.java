package com.Lokesh.Strings;
public class StringBuilderReverse {
    public static void main(String[] args) {
        String str = "Hello World! How are you";
        //---- method 1 .
//        String out = reverseString(str);
//        System.out.print(out);
        //----method 2.
//        System.out.println(reverseString(str));
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        String strings = "Hello World! How are you";
//        System.out.println(sb.compareTo(strings));
//        System.out.println();
    }
//    static String reverseString(String s ){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        return sb.toString();
//    }
}
