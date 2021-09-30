package com.Lokesh.BasicPrograms;

public class FIboRec {
    public static void main(String[] args) {
        fibo(7);
        System.out.println(fibo(7));

    }
    static int fibo(int n){
        if (n<2)
            return n;
        else
            return fibo(n-1) + fibo(n - 2);
    }
}
