package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = 5;
        System.out.println(fact(n));


    }

    private static int fact(int n) {
        if(n < 2 ) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
