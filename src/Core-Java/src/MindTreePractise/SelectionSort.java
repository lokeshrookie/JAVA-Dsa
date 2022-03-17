package MindTreePractise;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            int first = 0;
            int last = arr.length;
            int max = maxInd(arr,first,last);
            swap(arr, last, max);
        }
    }
    private static void swap(int[] arr, int last, int max) {
        int temp  = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
    private static int maxInd(int[] arr, int first, int last) {
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
