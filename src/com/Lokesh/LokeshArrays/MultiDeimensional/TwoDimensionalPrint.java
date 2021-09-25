package com.Lokesh.LokeshArrays.MultiDeimensional;

import java.util.Scanner;

public class TwoDimensionalPrint {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int[][] arr = new int[3][5];
        System.out.println(arr.length); // prints no of rows
//        System.out.println(arr[0].length);//prints columns in row 0
//        System.out.println(arr[1].length);// prints no of columns in row 1
//        System.out.println(arr[2].length);//prints no of columns in rows 2

        //length of each row using for loop
//        for (int row = 0; row < arr.length; row++) System.out.println(arr[row].length);

        //length of each row using foreach loop

//        for (int[] row :
//                arr)
//            System.out.println(row.length);

        //taking inputs for 2d array
        for (int row = 0; row < arr.length; row++) {
            for (int columns = 0; columns < arr[row].length; columns++) {
                arr[row][columns]  = s.nextInt();
            }
        }
        // inputs are taken


        //printing inputs
        for (int row = 0; row < arr.length; row++) {
            for (int columns = 0; columns < arr[row].length; columns++) {
                System.out.print(arr[row][columns] + " ");
            }
            System.out.println();
        }
    }
}
