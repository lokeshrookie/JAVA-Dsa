package SourceCode.Arrays;
import  java.util.Scanner;
public class Matrix
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  rows , columns , j , i;
        System.out.println("Enter the number of rows and columns : ");
        rows = s.nextInt();
        columns = s.nextInt();
        //creating an array to store values of matrix.
        int[][] a = new int[rows][columns];
        System.out.println("Enter the values. ");
        // taking the values into the matrix
        for(i=0; i<rows; i++)
            for (j = 0; j < columns; j++)
                a[i][j] = s.nextInt();
        //Printing the array.
        // int index = 0;
        System.out.println("The elements of the array are : ");
        for(i =0 ; i<rows ; i++){
            for(j =0; j<columns; j++){

                System.out.print( a[i][j]+ " ");
                // " " is used to create a space between the elements on the output
            }
        }//endof for loop
    }// end of main method
}

