import java.util.Arrays;
import java.util.Scanner;

public class ProductOfIntegers {

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        int[] b = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            b[i] = arr[i];
        }
        sort(arr);
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == b[i]){
                count++;
            }
        }
        System.out.println(count);
    }
    static  int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else
                    break;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

