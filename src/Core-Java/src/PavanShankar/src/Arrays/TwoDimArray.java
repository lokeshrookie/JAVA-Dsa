package Arrays;

import java.util.Scanner;
import java.util.*;

public class TwoDimArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = s.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int row = 0; row<matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = s.nextInt();
            }
        }
        setMatrixZero(matrix);
        for(int row = 0; row<matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
//                matrix[row][column] = s.nextInt();
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println();
        }
    }

    static int[][] setMatrixZero(int[][] matrix){
        HashSet<Integer> row_set = new HashSet<>();
        HashSet<Integer> column_set = new HashSet<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(matrix[i][j] == 0){
                    row_set.add(i);
                    column_set.add(j);
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(row_set.contains(i) || column_set.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }




        return matrix;
    }

}
