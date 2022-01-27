package MindTreePractise;

import java.util.Scanner;

public class ArrrayPractise {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int[][] arr = new int[s.nextInt()][s.nextInt()];
        for(int row = 0; row<arr.length; row++){
            for(int column = 0 ; column<arr[row].length; column++){
                 arr[row][column] = s.nextInt();
            }
        }
        //print
        for(int row = 0; row<arr.length; row++){
            for(int column = 0 ; column<arr[row].length; column++){
                System.out.print(arr[row][column]);
            }
        }
    }
}
