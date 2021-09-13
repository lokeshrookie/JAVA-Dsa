package com.Lokesh.Lokesh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int n = s.nextInt();
        int c =2;
        if(n<=1)
        {
            System.out.println("Neither prime not composite");
            return ; //System.exit(1);
        }
        if(n == 4 ) System.out.println("Not a Prime");
        else{
            while(c * c < n){
                if (n % c == 0 ){
                    System.out.println("Not a prime");
                    return;
                }
                c = c + 1; /// c++
            }// end of while
            if(c * c > n ) System.out.println("Prime");
        }
    }
}
