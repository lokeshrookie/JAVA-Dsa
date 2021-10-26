package com.Lokesh.Recursion;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(20);
        System.out.println(fibo(ans));
    }
    static  int  fibo(int n){
        //this is base condition
        if(n < 2){
            return n;
        }
        return  fibo(n-1 ) + fibo(n - 2);
    }
}
