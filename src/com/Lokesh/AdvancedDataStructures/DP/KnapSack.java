package com.Lokesh.AdvancedDataStructures.DP;

import java.util.Scanner;

public class KnapSack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        System.out.println(fibo(n));
        for (int i = 0; i <=n; i++) {
            System.out.println(i + " fibo is : " +  fibo(i));
        }
    }
    static int fibo(int n){
        if(n <=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
