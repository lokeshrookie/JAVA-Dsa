package com.Lokesh.Search;
// Linear search to search minimum element of an array.
public class LinearSearchMinimum {
    public static void main(String[] args) {
        int[] nums = { 22, 33, -5, -45, 99, 11, 43};
//        int min = 0;
        System.out.println(searchmin(nums));

    }
    static  int searchmin(int[] arr){
        int ans = arr[0]; // need to declare outside of the loop.
        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }
        } // end of for loop
         return ans;
    }  // end of method searchmin
}