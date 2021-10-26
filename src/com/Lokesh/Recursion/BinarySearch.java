package com.Lokesh.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-232, -23, 0, 1, 34, 543, 4534 , 980856};
//        int[] arr2 = {232,2324,3,35342,-3535,2354,1,0,876};
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
        int target = 1;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static  int  search(int[] arr, int target, int s, int e){
        if(s > e){                    // not found
            return -1;
        }
        int m = s + (e-s)/2;
        //base condition
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
