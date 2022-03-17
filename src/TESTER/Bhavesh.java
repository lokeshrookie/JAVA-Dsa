package TESTER;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Bhavesh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,9,5,7,8};
        System.out.println(  "ans = " + ticTacToe(arr));
    }

    public static String ticTacToe(int[] i){
        int[][] ans = new int[2][2];
        int count = 0;

        for (int row = 0; row < ans.length; row++) {
            for (int columns = 0; columns < ans[row].length; columns++) {
                ans[row][columns] = i[count];
                count++;
            }
        }

        for (int row = 0; row < ans.length; row++) {
            for (int columns = 0; columns < ans[row].length; columns++) {
                System.out.println(ans[row][columns]);
//                count++;
            }
        }

        return null;

    }
}
