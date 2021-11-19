package com.Lokesh.BasicInterviewQuestions;
public class FibonacciSeries{
  public static void main(String[] args) {
        // fibo(7);
        int n = 10;
//        for (int i=0;i<n ;i++ ){
//            System.out.println(fibo(i));
//        }
      System.out.println(fibo(0));
    }
    
    
    static int fibo(int n){
        if (n<2)
            return n;
        else
            return fibo(n-1) + fibo(n - 2);
    }
}
