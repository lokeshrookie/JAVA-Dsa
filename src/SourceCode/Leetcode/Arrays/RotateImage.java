package SourceCode.Leetcode.Arrays;
import  java.util.*;
public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println("After Transpose");
        transpose(arr);
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
        reverse(arr);
        System.out.println("after reverse: ");
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
    static void transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) { //  j ==  i means elements will be arranged row wise
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                for(int[] row: arr){
                }
            }
        }
    }
    static void reverse(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                // reveres elements in each row. starting with last element,....
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-1-j];
                arr[i][arr[i].length-1-j] = temp;
            }
        }
    }
}
