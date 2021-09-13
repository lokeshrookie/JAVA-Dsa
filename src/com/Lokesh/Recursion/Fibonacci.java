package com.Lokesh.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a  = s.nextInt();
        int ans = recursion(a);
//        System.out.println(ans);

    }
    static int recursion( int n ){
//        if(n<0){
//            return -1;
//        }
//        if(n == 0 || n == 1){
//            return n;
//        }
        //simplified:
        if(n<2){ // for n<2, (0,1) == (0,1) will be printed respectively.
            return n;
        }
        return recursion(n-1)+ recursion(n-2);
    }
}
