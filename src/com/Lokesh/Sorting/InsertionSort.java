package com.Lokesh.Sorting;


import java.util.Arrays;

/**
 * // for i = 0 , array sorted upto index 1.
 * for i = n-1 , array is sorted upto index n.
 *
 *
 *          why insertion sort ?
 * no of swaps reduced as compared to bubble.
 * takes less time if an array is partially sorted.
 * takes part in hybrid sorting algorithms.
 */

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {534,-23,0,232,4,11,-1213,3};
        int[] arr = {5,4,3,2,1};
        System.out.println("Before Sorting: " + Arrays.toString(arr) );
        insertion(arr);
        System.out.println( "\n After Sorting: " +Arrays.toString(arr));
    }

    static int[] insertion(int[] arr){
        for (int i = 0; i <arr.length-1; i++) { // i runs till n-1 . if i = 2, j runs 3 times, j=(3,2,1) // if i = 3, j = (4,3,2,1).
            for (int j = i+1 ; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else
                {
                    break; // because left hand side elements are sorted.
                }
            }
            /*
               use the two lines to print sorted array after step.
               System.out.println();
               System.out.println(Arrays.toString(arr));

             */
        }
        return arr;
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}


/*
5 4 3 2 1
 5 4 3 2 1

 i = 0:      4 5 3 2 1, break
 i = 1:      4 3 5 2 1, 4 3 5 2 1, break
 i = 2:      4 3 2 5 1, 4 2 3 5 1 ,
 */