package MindtreeInternship.JavaFoundation;

import java.util.Arrays;
import java.util.Scanner;

public class SortingPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int[] arr = new int[si];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(bubble(arr)));
    }

    static int[] bubble(int[] arr){
        for(int  i = 0; i<arr.length-1; i++){
            for(int j = 1 ; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
                }
            }
        }
        return  arr;
    }

    static int[] selection(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int last  = arr.length-1-i;
            int max = findMax(arr);
            int temp = last;
            last = max;
            max = temp;
//            swap(arr, max, last);
        }
        return arr;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max  = arr[i];
            }
        }
        return max;
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
