package SourceCode.BasicInterviewQuestions;

import java.util.Scanner;

public class FibonacciSeriesNormal {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c ;
        for(int i = 0; i<=n; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
//        System.out.println(c);
    }
}
