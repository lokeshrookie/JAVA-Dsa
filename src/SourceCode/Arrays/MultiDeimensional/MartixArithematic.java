package SourceCode.Arrays.MultiDeimensional;

import java.util.Scanner;
public class MartixArithematic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] add =  new int[2][2];

        System.out.println("Enter the elements of 1st Matrix");
        for (int row = 0; row < arr1.length; row++) {
            for (int column = 0; column < arr1[row].length; column++) {
                arr1[row][column] = s.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter the elements of 2nd matrix");
        for (int row = 0; row < arr2.length; row++) {
            for (int column = 0; column < arr2.length; column++) {
                arr2[row][column] = s.nextInt();
            }
        }
        s.close();      //
        System.out.println();
        System.out.println("Matrix after addition is:");
        for (int row = 0; row <add.length ; row++) {
            for (int column = 0; column < add.length; column++) {
                add[row][column] = arr1[row][column] + arr2[row][column];
                System.out.print(add[row][column] + " ");
             }
        }
        System.out.println();
        System.out.println("Matrix after subtraction is :");
        for (int row = 0; row <add.length ; row++) {
            for (int column = 0; column < add.length; column++) {
                add[row][column] = arr1[row][column] - arr2[row][column];
                System.out.print(add[row][column] + " ");
            }
        }
        System.out.println();

        System.out.println("Matrix after Multiplication is");
        for (int row = 0; row <add.length ; row++) {
            for (int column = 0; column < add.length; column++) {
                add[row][column] = arr1[row][column] * arr2[row][column];
                System.out.print(add[row][column] + " ");
            }
        }
        System.out.println();

        System.out.println("Matrix after division");
        for (int row = 0; row <add.length ; row++) {
            for (int column = 0; column < add.length; column++) {
                add[row][column] = arr1[row][column] / arr2[row][column];
                System.out.print(add[row][column] + " ");
            }
        }

    }
}
