package com.Lokesh.BitManipulation;

public class IthBitOfaNumber {
    public static void main(String[] args) {
//        find(7,1);
        System.out.println(find(127,7));
    }
    static  int find(int n, int k){
//        return n & (1>>(n-1));
//        return ((n & (1 << (k-1))) >> (k-1);
       return   ((n & (1 << (k - 1))) >> (k - 1));
    }
}
