package com.Lokesh.Math1;

import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 40;
        boolean[] primes = new boolean[num+1]; // n+1 to include n. index starts from 0.
        sieve(num, primes);
    }

    private static void sieve(int num, boolean[] primes) {
        for (int i = 2;  i*i<=num; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=num ; j+=i) {
                    primes[i] = true;
                }
            }
        }
        for(int i = 2; i<=num; i++){
            if(!primes[i]){
                System.out.println(i + " ");
            }
        }
    }
}
