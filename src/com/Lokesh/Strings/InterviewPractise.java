package com.Lokesh.Strings;

public class InterviewPractise {
    public static void main(String[] args) {
//        skipChar("hello", 'l');
        dup("hello");
    }
    //skip character
    static void skipChar(String s , char c){
        String ans = "";
        for(int i = 0;i<s.length();i++){
            if(!(s.charAt(i) == c)){
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    //String uniques and duplicates
    static void dup(String s){
        String uniques = "";
        String dup = "";
        for(int i = 0; i<s.length(); i++){
            if(!uniques.contains(Character.toString(s.charAt(i)))){
                uniques = uniques + s.charAt(i);
            }
            else
                dup = dup + s.charAt(i);
        }
        System.out.println("Uniques : " + uniques);
        System.out.println("Duplicates : " + dup);
    }
}
