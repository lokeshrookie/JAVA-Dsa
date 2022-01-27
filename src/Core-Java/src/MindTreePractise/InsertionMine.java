package MindTreePractise;

import java.util.Arrays;
import java.util.Collections;

public class InsertionMine {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        Collections.sort(Arrays.asList(arr));
//        Arrays.sort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr) {
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
}
