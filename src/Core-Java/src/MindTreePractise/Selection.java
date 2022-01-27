package MindTreePractise;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = max(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int max(int[] arr, int first, int last) {
        int max = 0;
        for(int i = first; i<=last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return  max;
    }


}
