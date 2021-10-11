package com.Lokesh.Recursion;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args ){
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the range of fibonacci numbers to print :");
        int n = s.nextInt();
        s.close();
        // loop to print every Fibonacci number
        for (int i = 0; i< n ; i++){
            System.out.println(recursive(i));
        }
    }
    // Method to return fibonacci number;
    static int recursive(int n ){
        if(n<2){
            return n;
        }
        return recursive(n-1) + recursive(n -2 );
    }
}
