package SourceCode.Sorting;

import java.util.Arrays;

/**
 * Cyclic Sort: To improve time complexity
 *
 * to sort a continues numbers
 * used to sort the numbers in the range of 1 to N.
 *
 * What is cyclic sort
 *
 * 1. First assume the correct index of every number.
 * 2. Correct index = arr[i] - 1. because, we use number starting form 1.
 * so, to get the element at an index , we can get it by
 */

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Before Sorting" + Arrays.toString(arr));
        cyclic(arr);
        System.out.println("After swapping" + Arrays.toString(arr));
    }

     static int[] cyclic(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1; //correct index = element - 1
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}

/*

Logic:
    5 4 3 2 1
    position of element  5  is 5-1(index).
    position of element  1  is 0th index(1-1)

Analysis:
    * Time Complexity : O(N)


 */


/*
when to use ?
    when given n  no of  numbers ( range)
    find missing number, missing small positive number.



    ALGORITHM:
        1.
 */