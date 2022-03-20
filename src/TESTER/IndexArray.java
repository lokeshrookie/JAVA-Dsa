package TESTER;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IndexArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int[] arr = new int[si];
        for(int i = 0;i<arr.length; i++){
            arr[i] = s.nextInt();
        }
//        int[] arr = {5,4,3,2,-1,0};
        System.out.println("Original Array is  : " + Arrays.toString(arr));
        System.out.println("New Array is : "  + Arrays.toString(method(arr)));

    }
    static int[] method(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            ans[i] = isFound(arr, i);
        }
        return ans;
    }
    static int isFound(int[] arr , int n){
        for (int j : arr) {
            if (j == n) {
                return n;
            }
        }
        return -1;
    }
}
