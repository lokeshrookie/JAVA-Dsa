package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
//        System.out.println(isArmstrong(number));
        for (int i = 1; i <=number; i++) {
            if(armstrong2(i)){
                System.out.println(i);
            }
        }
        s.close();
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }

    static  boolean armstrong2(int n ){
        int org  = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem * rem * rem;
        }
        return sum == org;
    }


































    
}
