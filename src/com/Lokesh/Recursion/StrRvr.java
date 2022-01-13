package com.Lokesh.Recursion;


public class StrRvr {
    public static void main(String[] args) {
        String s = "Hello";
//        String m = "Hello";
//        StringBuffer sb = new StringBuffer("Hello");
//        StringBuffer sa = new StringBuffer("Hello");
        System.out.println(reverse(s));
//        System.out.println(sa.hashCode() + " " + sb.hashCode());
//        System.out.println(m.hashCode() + " " + s.hashCode());
    }
    static String reverse(String s){
        if(s.equals("")){
            return  "";
        }
        return  reverse(s.substring(1)) + s.charAt(0);
    }
}
