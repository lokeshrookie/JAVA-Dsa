package com.Lokesh.Sorting;

import java.util.Arrays;

/**
 * Quick sort using two pointer method
 *
 * 1. take any element as pivot.
 * 2. move all the numbers smaller than pivot to the left hand side and larger elements to the right hand side.
 * 3. Then the pivot will be at the correct index.
 * NOTE: IN QUICK SORT, AFTER EVERY ITERATION, WE WILL PUT THE PIVOT AT THE CORRECT INDEX.
 *
 * NOTE: if the array is sorted, then it will try to sort it even. (Like MergeSort).
 *
 *
 *
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-8,-1};
        int[] arr2 = {1,2,3,4,5};
        quickSort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }

    // low and high denotes which part we are working on.
    // start and end is for swapping in that part.
    private static void quickSort(int[] arr, int low, int high) {
          if(low >= high){
              return ;
          }
          int start = low;
          int end = high;
          int mid = start + (end - start)/2;

          int pivot = arr[mid];

          while(start <= end){
              //this wile loop executes until the element is not less than the pivot.
              // if element is less than pivot, leave it at same index and check the element at next index.
              while(arr[start] < pivot){
                  start++;
              }
              //This while loop stops executing only when the element from right side(end) is not grater than pivot.
              // end should be greater than pivot.Because only then, the pivot is at the correct index.

              while (arr[end] > pivot){
                  end--;
              }
              // check if the array is sorted. if sorted, then above condi
              // if any violations, then swap left side element with right side element.
              if(start  <= end){
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
              }
          }

          //now pivot is at correct index. then swap two halves now.
        quickSort(arr, low, end);
          quickSort(arr, start , high);
    }
}


