package TESTER;

import java.util.Arrays;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        int[] arr = { 0, 232, -23, 424, 526,};
//        Scanner s = new Scanner(System.in);
//        String A = s.next();
//        String B = s.next();
//        System.out.println();
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            last
            int last = arr.length-1;
            // max = max index
//            swap
        }
    }

//    String A = s.next();

    private static void mergeSortInplace(int[] arr, int start, int end){
        int length = end - start;
        if(length == 1){
            return;
        }
        int mid = start + (end - start)/2;

        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);
        mergeInplace(arr, start , mid, end);
    }

    private static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start]; // end - start = length.

        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end){
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
        // adding remaining elements to the mix array. if any of the array is larger than other.
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
        // copy all the array elements of new array(mix) to the old array(arr)
        for(int l = 0; l<mix.length; l++){
            arr[start + l] = mix[l];
        }
    }

}
