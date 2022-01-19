package com.Lokesh.AdvancedDataStructures.DP;

import java.util.Scanner;


public class FIBOTABULATION {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<=n; i++)
        {
            System.out.println( i + " th fibo is : " + fiboTabulation(i));
        }
    }

    static int fiboTabulation(int n){
        if(n <2){
            return n;
        }
        int prev = 0;
        int current = 1;
        for(int i = 2; i<=n; i++){
            int newone  =  current + prev;
             prev = current;
             current = newone;
        }
//        System.out.println(current);
        return current;

    }

//    static int fibo(int n ){
//        if(n <= 2){
//            return n;
//        }
//        int[] arr = new int[n+1];
//
//        Arrays.fill(arr, -1);
//
//        arr[0] = 0;
//        arr[1] = 1;
//        int first = 0;
//        int second = 0;
//        if(fibo(n-1)  != -1 && fibo(n-2) != -1 ){
//            return arr[n-1] + arr[n-2];
//        }
//        else{
//            for(int i = 2; i<=n; i++){
//                if(arr[i] != -1){
//                    first = arr[i];
//                }
//                else
//                    first = fibo(i);
////                if(arr[i])
//            }
//        }
//
//        return fibo(n-1) + fibo(n-2);
//
//    }


    /*
    if(arr[i-1] != -1){
                first = arr[i-1];
            }
            else{
                first = fibo(n-1);
            }

            if(arr[i-2] != -1){
                second = arr[i-2];
            }
            else{
                second = fibo(n-2);
            }
     */
}









