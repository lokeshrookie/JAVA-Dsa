package MindTreePractise;

import java.util.Arrays;

public class SelectionMin {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i = 0; i<arr.length; i++){
//            int first = i;
            int min = minIndex(arr, i, arr.length-1);
            swap(arr, i, min);
        }
    }

    private static void swap(int[] arr, int first, int min) {
        int temp = arr[first];
        arr[first] = arr[min];
        arr[min] = temp;
    }

    private static int minIndex(int[] arr, int first, int last) {
        int min = first;
        for(int i = 0; i<=last; i++){
            if(arr[i] <=arr[first]){
                min = i;
            }
        }
        return  min;
    }
}
