package com.Lokesh.Math1.BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(7));

    }
    private static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            count = count + (n&1); // bracket mukyam bigulu.
            // alternative for above line==> count+=n&1;
            n = n>>1; // for removing last digit.
        }
        return count;
    }
}
