package MindTreePractise;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,-23,-50,0,-887,1281,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = arr.length-1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
