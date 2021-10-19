package com.Lokesh.Sorting;

import java.util.Arrays;

public class Insertion{
    public static void main(String[] args) {
        int[] arr = { 534, 24232, 4, 0, -121, -203924 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { // i < arr.length -1  is equal to i<=arr.length-2
            for (int j = i+1; j >0 ; j--) { //for i=0, we sort elements at index 0, 1.// for i =4, this will sort 5
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else
                    break;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
 1. tkaes more time.
 2. used when insufficient memory is there.
 */