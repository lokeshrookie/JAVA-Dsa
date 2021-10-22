package com.Lokesh.Arrays.BareMinium;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
