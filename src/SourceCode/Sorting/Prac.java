package SourceCode.Sorting;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
//        bubble(arr);
//        System.out.println(Arrays.toString(selection(arr)));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    
    
    
    // Insertion Sort 
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j =1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }

            }
        }
    }


    //selection sort
    static int[] selection(int[] arr){
        for(int i =  0; i<arr.length; i++){
            int last = arr.length-1-i;
            int max = maxI(arr, last);  // find max element from index 0 to index last.
            swap(arr, max, last);
        }
        return arr;
    }

    // method of swapping.
    static int maxI(int[] arr, int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    //swapping
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }





    //bubble sort
    static int[] bubble(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
