package com.Lokesh.Sorting;


///**
// *
// *          IN SELECTION SORT, FOR EVERY ITERATION, LARGEST ELEMENT WILL BE SWAPPED WITH THE LAST INDEX.
// * Algorithm:
// * 1. // * 1. select the index of largest element.
// * 2. select the index of largest element.   (last element = arr.length-i-1)
// * 3.swap largest element with to the last element.
// * 4.then select the next largest element using index and swap the element with next largest index.
// *
// */

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSortKunal {
    public static void main(String[] args) {
        int[] arr = {4,11,1,6,-86,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //
            int last = arr.length-i-1; // same as arr.length-1-i.
            //swap this with maxIndex.
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }



    private static int getMax(int[] arr, int start, int end){
        int max = start; // initially max = 0.
        for (int i = start; i <=end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }


}
