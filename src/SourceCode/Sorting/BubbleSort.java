package SourceCode.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {6,33,0,62,4,3,-1};
//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(bubblesort(a)));
    }
    static int[] bubblesort(int [] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            // traversing until (lastIndex -i). if i = 0, we will travese until the last index.
            //if i = 1, we will traverse until (last index-1) only. becuse the last element was already sorted(during first try(i=0)).
            for (int j = 1; j<arr.length-i;j++){ // same as j<=arr.length-1-i
                //comparing from j = 1 because, we have to compare j with previous element. so, initializing j  = 0 will give error.
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
        }
        if(swapped){
            System.out.println("Not Sorted");
        }
        return arr;
    }
}
