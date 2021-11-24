package com.Lokesh.Recursion;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args ){
//        Scanner s  = new Scanner(System.in);
//        System.out.print("Enter the range of fibonacci numbers to print :");
//        int n = s.nextInt();
//        s.close();
//        // loop to print every Fibonacci number
//        for (int i = 0; i< n ; i++){
//            System.out.println(recursive(i));
//        }
        System.out.println(fact(5));




    }
    // Method to return fibonacci number;
    static int recursive(int n ){
        if(n<2){
            return n;
        }
        return recursive(n-1) + recursive(n -2 );
    }

    static int rec(int n ){
        if(n<2){
            return  n;
        }
        return rec(n-1)+rec(n-2);
    }

    static  int fact(int n ){
        if(n<2){
            return n;
        }
        return n * fact(n-1);
    }

}
