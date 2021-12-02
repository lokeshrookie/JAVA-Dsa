package com.Lokesh.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortPractise {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4,6,78,65,45,98,7,90};
//        mergesort(arr);
//        System.out.println(Arrays.toString(mergesort(arr)));
//        System.out.println(Arrays.toString(arr));
        msIn(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergesort(int[] arr) {
        int length = arr.length;
        //base case
        if(arr.length <=1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, length));

//        mergesort(left);
//        mergesort(right);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int l = 0; // left array
        int r = 0; // right array
        int m = 0; //  for mix array

        while(l<left.length && r<right.length){
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

        while(l< left.length){
            mix[m] = left[l];
            l++;
            m++;
        }
        while(r<right.length){
            mix[m] = right[r];
            r++;
            m++;
        }
        return mix;
    }

    static  void msIn(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }
        int mid = s + (e - s)/2;
       msIn(arr, s, mid);
       msIn(arr, mid, e);
       mIp(arr, s, mid, e);
    }

    private static void mIp(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
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
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

    }

}
