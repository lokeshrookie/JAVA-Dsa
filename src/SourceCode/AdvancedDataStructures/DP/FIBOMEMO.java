package SourceCode.AdvancedDataStructures.DP;

import java.util.Arrays;
import java.util.Scanner;

public class FIBOMEMO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        /*

         */
        //initialise all values of array with -1
        int[] dp = new int[n+1]; // 1 extra index for 0.
        Arrays.fill(dp, -1);


        for(int i = 0; i<=n; i++){
            System.out.println(i + " th fibo is : " + fibo(i, dp));
        }
    }


    static int fibo(int n, int[] dp){

        // base case
        if(n <2){
            return n;
        }

        // if value found in array , return value directly
        if(dp[n] != -1)
            return dp[n];


//        if values are not calculated, then calculate and store the values in the array.
        return dp[n] = fibo(n-1, dp) + fibo(n-2 , dp);
    }



}



/*
  Previous method 1: failed to use first and second variables.



//        // initialize first two indices.
//        int first = 0;
//        int second = 1;
//
//        //If any of first or second is having a value (first = fibo(n-1) and second = fibo(n-2)),
//        // assign the value without calculation and calculate the another value.
//        if(dp[n-1] != -1){
//            first = dp[n-1];
//        }
//        else
//            first = fibo(n-1, dp);
//
//        if(dp[n-2] != -1){
//            second = dp[n-2];
//        }
//        else
//            second = fibo(n-2, dp);
 */
