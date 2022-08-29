package SourceCode.Leetcode.Arrays;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr =new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(setMatrixZeroes1D(arr)));
    }
    static int[] setMatrixZeroes1D(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            }
            else if(arr[i] == 0){
                arr[i] = 1;
            }
        }
        return arr;
    }

//    static int[][] setMatrixZeroes(int[][] matrix){
//
//
//
//
//    }
}
