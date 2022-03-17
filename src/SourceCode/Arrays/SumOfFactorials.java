package SourceCode.Arrays;

import java.util.Scanner;

public class SumOfFactorials {
    static  int sum = 0;
    static int factorial = 1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size  = s.nextInt();
        
        int[] arr = new int[size];
        // input array elements
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        for (int i = 0; i < size; i++) {
            if(arr[i]>0 && arr[i] < 10){
                sum += fact(arr[i]);
            }
        }
        System.out.println(sum);
//        System.out.println(factorial);
    }
    static int fact(int a ){
        for (int i = 1; i <=a; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }
}

