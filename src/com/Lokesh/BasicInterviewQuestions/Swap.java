package com.Lokesh.BasicInterviewQuestions;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println( a + " " + b);
        a = a + b;  // 11 = 5 + 6;  a = 11, b = 6
        b = a - b; //  5 = 11 - 6;  a = 11, b = 5
        a = a - b;//   6 = 11 - 5;  a = 6, b = 5;
        System.out.println(a + " " + b);
    }

}
