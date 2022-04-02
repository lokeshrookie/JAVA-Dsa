package SourceCode.Sorting;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int[] a = new int[]{6,7,8,9,10};
        int[] b = new int[]{1,2,3,4,5};
//        merge(a,b);
        merge(a,a.length , b, b.length);
        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(merge(a, a.length, b, b.length)));
    }


//     MergeSort
//    static int[] mergeSort(int[] arr){
//        int length = arr.length;
//        if(length <= 1){
//            return arr;
//        }
//        int mid = arr.length/2;
//        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, length));
//        return merge(left, right);
//    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] left = nums1;
        int[] right = nums2;
        nums1 = new int[m+n];
        int l = 0;
        int r = 0;
        int num = 0;

        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                nums1[num] = left[l];
                l++;
            }
            else{
                nums1[num] = right[r];
                r++;
            }
            num++;
        }
        while(l < m ){
            nums1[num] = left[l];
            l++;
            num++;
        }
        while(r < n){
            nums1[num] = right[r];
            r++;
            num++;
        }


    }

//    static int[] merge(int[] left, int[] right){
//        int[] mix = new int[left.length + right.length];
//        int l = 0;
//        int r = 0;
//        int m = 0;
//        while(l < left.length  && r< right.length){
//            if(left[l] < right[r]){
//                mix[m] = left[l];
//                l++;
//            }
//            else{
//                mix[m] = right[r];
//                r++;
//            }
//            m++;
//        }
//        while(l < left.length){
//            mix[m] = left[l];
//            l++;
//            m++;
//        }
//        while(r < right.length){
//            mix[m] = right.length;
//            r++;
//            m++;
//        }
//        return mix;
//    }

    
    
    
    // Insertion Sort 
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j =i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }


    //selection sort


    //swapping
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
