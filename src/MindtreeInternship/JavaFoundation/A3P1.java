package MindtreeInternship.JavaFoundation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**Transpose of Matrix/**/
public class A3P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] a = new int[rows][columns];
        int[][] b = new int[columns][rows];

        // step 1: Taking inputs for first array.(a)
        for(int row = 0; row<a.length; row++){
            for (int column = 0; column<a[row].length; column++){
                a[row][column] = s.nextInt();
            }
        }

        // step 2: copying values to the new array;
        for(int row = 0; row<b.length; row++){
            for (int column = 0; column<b[row].length; column++){
                b[row][column] = a[column][row];
            }
        }
        // step 3: printing the transpose of matrix.
        for(int row = 0; row<a.length; row++){
            for (int column = 0; column<a[row].length; column++){
                System.out.print(b[row][column] + " ");
            }
            System.out.println();
        }
    }
}
