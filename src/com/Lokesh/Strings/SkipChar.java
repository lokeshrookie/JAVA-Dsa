package com.Lokesh.Strings;

public class SkipChar {
    public static void main(String[] args) {
        String s = "baccad";
        char c = 'a';
//        skipchar(s, c);
        System.out.println(skipchar(s,c));
    }
    //skip a character
    static String skipchar(String s, char c){
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if(c != s.charAt(i)){
                ans = ans + s.charAt(i);
            }
        }
        return ans;
    }
}
