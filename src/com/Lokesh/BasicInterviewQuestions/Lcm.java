package com.Lokesh.BasicInterviewQuestions;

public class Lcm {
    public static void main(String[] args) {
        int a =4, b = 8, lcm = 0;
        int c = Math.max(a,b);
        for (int i = c; i <= a*b ; i = i + c) {
            if((i%a == 0) && (i%b == 0)){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
