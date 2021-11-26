package com.Lokesh.Arrays.MultiDeimensional;

import java.util.Scanner;

public class TwoDimensionalBubbleSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows :");
        int row = s.nextInt();
        System.out.println("Enter columns : ");
        int column = s.nextInt();
        int[][] arr = new int[row][column];
        for(row = 0; row< arr.length; row++){
            for(column = 0; column < arr[row].length; column++){
                arr[row][column] = s.nextInt();
            }
        }

        twoSort(arr,row, column);

        for(row = 0; row< arr.length; row++){
            for(column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
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



    static  void  sort(int[] arr){

    }
}
