package com.Lokesh.BasicPrograms;

import java.util.Scanner;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num  = s.nextInt();
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int n) {
        int c = 2;
        if(n<=1){
            return  false;
        }
        while (c*c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}
