package SourceCode.Sorting;

import java.util.Arrays;

/**
 *  1. Divide the array into two parts
 *  2. Sort both the sub arrays using recursion
 *  3. Merge the two sorted sub arrays.
 *
 */

public  class MergeSort{
    public static void main(String[] args) {
        int[] arr = {23,0,-23,-1,34,232,23123,-2323,2};
//        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }


    private static int[] mergeSort(int[] arr) {
        int length = arr.length;
        //base case
        if(length <= 1) return arr;

        int mid = length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, length-1));
        return merge(left, right); // return the mix[]  array.
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int l = 0;
        int r = 0;
        int m = 0;

        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                mix[m] = left[l];
                l++;
            }
            else{
                mix[m] = right[r];
                r++;
            }
            m++;
        }

        //if any of the array is large than other array, there may be
        // a possibility that larger array may not be added to new mix array.
        while (l < left.length){
            mix[m] = left[l];
            l++;
            m++;
        }
        while (r < right.length){
            mix[m] = right[r];
            r++;
            m++;
        }
        return mix;
    }

    //MergeSort Inplace
    private static void mergeSortInplace(int[] arr, int start, int end) {
        if(end -start == 1){ // length = end - start
            return;
        }
        int mid =  start + (end - start)/2;

        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);
        mergeInplace(arr, start, mid, end);
    }


    private static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start]; // end - start = length.

        int i = start; //first part of the array starts form the start. start is the first index of the first array.
        int j = mid; // second part of the array starts from mid. mid is the first index of second array.
        int k = 0 ; // k is for new array(mix). k is the starting index.

        while(i    < mid && j < end){ // mid is the last index of first array.. end is the last index of the second array.
           if(arr[i] < arr[j]){
               mix[k] = arr[i];
               i++;
            }
           else{
               mix[k] = arr[j];
               j++;
            }
           k++;
        }

        //if any of the array is large than other array, there may be
        // a possibility that larger array may not be added to new mix array.
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        // copying the values from mix array to original array.
        // copy all the array elements of new array(mix) to the old array(arr)
        for(int l = 0; l<mix.length; l++){
            arr[start+l] = mix[l];
        }
    }
}














