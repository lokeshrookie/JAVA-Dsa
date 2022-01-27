package SourceCode.Sorting;
//Bubble Sorting
import java.util.Arrays;

public class BubbleSortJet {
    public static void main(String[] args) {
        int[] arr2 = {3, 46, -5, 9};
        // int[] arr3 = {'c'};
//        System.out.println(Arrays.toString(new int[]{'c','d','e'}));
        System.out.println(Arrays.toString(bubbleSort(arr2)));
    }
    static int[] bubbleSort(int[] arr){
        int min = arr[0];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                temp = min;
                min = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
