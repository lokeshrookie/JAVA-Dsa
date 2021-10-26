package com.Lokesh.Recursion;

public class NumbersUptoN {
    static  int x = 20; // Remeber to take global variable
    public static void main(String[] args) {
        print(1);
    }
    static  void print(int n){
        System.out.println(n);
        if(n==x){
            return;
        }
        print(n+1);
    }
}
