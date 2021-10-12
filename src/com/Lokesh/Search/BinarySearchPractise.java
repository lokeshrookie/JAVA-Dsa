package com.Lokesh.Search;
public class  BinarySearchPractise{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 6;
        // System.out.println(binarySearch(arr, 6, 0, 7));
        System.out.println(bsp(arr, target));

    }
    static int bsp(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end )/2;
        while(start < end){
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    // jet code

//     public static int binarySearch(int[] array, int elem, int left, int right) {
//     while (left <= right) {
//         int mid = left + (right - left) / 2; // the index of the middle element
            
//         if (elem == array[mid]) {
//             return mid; // the element is found, return its index
//         } else if (elem < array[mid]) {
//             right = mid - 1; // go to the left subarray
//         } else {
//             left = mid + 1;  // go to the right subarray
//         }
//     }
//     return -1; // the element is not found
// }
}
