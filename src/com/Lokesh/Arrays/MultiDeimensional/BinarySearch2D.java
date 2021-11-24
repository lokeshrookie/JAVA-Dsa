package com.Lokesh.Arrays.MultiDeimensional;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{3,2,11,3},{534,2,313,4}};
//        linear(arr, 3);
//        System.out.println(linear(arr,3));
        System.out.println(Arrays.toString(linear(arr,3)));
    }
    static int[] linear(int[][] arr, int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i][j] == target){
//                    System.out.println("found");
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }

    static  void binary(int[][] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end -start)/2;
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr.length; j++){
                    if(arr[i][j] == target){
                        System.out.println();
                    }
                }
            }
        }
    }


    static  void twoSort(int[][] arr, int row, int column){
        for(row = 0; row < arr.length; row++)
            for (column = 0; column < arr[row].length; column++)
                for (int i = 0; i<arr.length; i++){
                    for(int j = 0; j<arr.length-i; j++){
                        if(arr[row][column] < arr[i][j]){
                            int temp = arr[row][column];
                            arr[row][column] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
    }



}