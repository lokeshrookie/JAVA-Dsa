package com.Lokesh.BasicInterviewQuestions;
import java.util.*;
public class anilPrime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int flag=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(n<=1) {
            System.out.println("Number is not prime");
            return;
        }

        if (flag == 0) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }

}