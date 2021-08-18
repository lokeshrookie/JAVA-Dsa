package com.Lokesh.Lokesh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        // code for recursion function :
//        Main re = new Main();

//         int ans = re.recursion(n);
        // n =  last fibonacci number.
        int a = 0;
        int b = 1;
      //  System.out.println(a);
        int count = 2;
        while(count <= n){
            int temp = a + b;
            a = b;
            b = temp  ;
            count++;
           // System.out.println(b);
        }
        System.out.println(b);// to print fibonacci series, uncomment the above two;
        // lines and comment this one
    }
}


//using recursion

