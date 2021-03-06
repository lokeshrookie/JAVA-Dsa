package SourceCode.Sorting;

import java.util.Arrays;

/*
    TIME COMPLEXITY:
    WORST CASE: O(N)^2
    BEST CASE: O(N LOG N)
 */

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
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-8,-1};
        int[] arr2 = {1,2,3,4,5};
        sort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }

    // low and high are the main one's. Which tells us which part of array we are working on.
    // start and end are just for swapping.
    private static void quickSort(int[] arr, int low, int high) {
          if(low >= high){
              return ;
          }

        // take start and end for swapping purpose
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
              // check if the array is sorted. if sorted, the start pointer will move to the right side
              // and end pointer will move to the left side of the array.

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
        quickSort(arr, low, end); //    to check if the left side elements are sorted
          quickSort(arr, start , high); // to check the sorting of right side elements
    }


    static  void sort(int[] arr, int low, int high){

    }

    static void quick(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        //  s and e for swapping comparison
        int m = s+(e-s)/2;
        int pivot = arr[m];
        while(s <= e){
            // if already sorted, not sorted again.
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            // swap start and end.
            // swap if violated the condition.
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            //after swapping, s will be grater than e.

        }
        //sort both arrays.
        //so first half array will be from low to end.(end is element next to pivot.)
        // second half array will be start to high. (start is previous element of pivot.)
        //pivot is at correct index. sort left and right side arrays.
        quick(arr, low,e);
        quick(arr, s, high);
    }
}





























