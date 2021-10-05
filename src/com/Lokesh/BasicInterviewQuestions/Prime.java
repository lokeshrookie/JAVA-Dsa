package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(isPrime(number));
    }
    static Boolean isPrime(int n){
        if (n<2){
            return false;
        }
        int c = 2;
        while (c*c <=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
