package com.Lokesh.BasicPrograms;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if(num1 > num2){
            //number 1 will be largest. now we have to compare number 1 with number 3.
            if ( num1 > num3){
                // number1 will be largest
                System.out.println(num1);
            }
            else{
                //num3 will be larger
                System.out.println(num3);
            }
        }
        else{
            //number2 will be larger than num1. we have to compare num2 with number 3.
            if(num2 > num3){
                //number 2 will be largest
                System.out.println(num2);
            }
            else
                // number 3 will be larger
                System.out.println(num3);
        }
    }
}
