package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class FibonacciSeriesNormal {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i<n-1; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
