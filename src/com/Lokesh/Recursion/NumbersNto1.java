package com.Lokesh.Recursion;

public class NumbersNto1 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        print(n-1);
    }
}
