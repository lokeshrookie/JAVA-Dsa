package com.Lokesh.BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =  s.nextInt();
        int temp =num;
        if(temp >num*num){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}