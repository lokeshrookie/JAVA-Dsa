package com.Lokesh.Strings;

public class SubStringOptimised {
    public static void main(String[] args) {
        String s = "loki";
        sub(s);
    }

    static  void sub(String  s){
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

}
