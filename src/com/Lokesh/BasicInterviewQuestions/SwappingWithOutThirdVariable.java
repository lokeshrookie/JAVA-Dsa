package com.Lokesh.BasicInterviewQuestions;

public class SwappingWithOutThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        System.out.println(a + " " + b);

//        int temp = a ;
//        a = b;
//        b = temp;

//        a = a -(-b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println( a + " " + b );

    }
}
