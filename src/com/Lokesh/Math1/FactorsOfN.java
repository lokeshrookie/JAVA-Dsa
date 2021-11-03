package com.Lokesh.Math1;

public class FactorsOfN {
    public static void main(String[] args) {
        factors(30);
    }
    static  void factors(int n){
        for (int i = 1; i <=n; i++) {
            if(n % i == 0 ){
                System.out.println(i + " ");
            }
        }
    }
}
/*
Time Complexity:     O(N).
 */
