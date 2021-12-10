package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class IsPrime {

    /* note :  we have to use (i*i < = n ) condition
        n < 2 ==> false
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println(isPrime(n));
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + prime(i));
        }
    }


    private static boolean isPrime(int n) {
        if(n < 2){
            return  false;
        }
        for (int i = 2; i*i <= n ; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return  true;
    }

    static  boolean prime(int n){
        if(n < 2){
            return false;
        }
        else{
            for(int i  = 2 ; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
