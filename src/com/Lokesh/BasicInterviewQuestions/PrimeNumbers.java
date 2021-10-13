package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        //Loop to print the prime numbers upto n.
        for (int i = 0; i < n; i++) {
           if(isPrime(i)){
                System.out.println(i);
            }
           //System.out.println(i + " " + isPrime(i)  );
        }
    }


    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2; // starting from 2, checking the factors.
        while(c * c <= num){ // c * c  = n ==> c = sqrt(n). checking factors upto n.
            if(num%c == 0){ // if n divided by c(any number b/w 2 and sqrt(n)), then this is not prime.
                return false; // so return false.
            }
            c++;         // if not divided, then check same condition with next number in series.
        }
        return true; // return true if no number will divide the n.
    }

}
