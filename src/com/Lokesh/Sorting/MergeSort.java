package com.Lokesh.Sorting;

import java.util.Arrays;

public  class MergeSort{
    public static void main(String[] args) {
        int[] arr = {23,0,-23,-1,34,232,23123,-2323,2};
//        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
        ;
    }


    private static int[] mergeSort(int[] arr) {
        int length = arr.length;
        //base case
        if(length <= 1) return arr;

        int mid = length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, length));

        return merge(left, right); // return the mix[]  arry
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


}














