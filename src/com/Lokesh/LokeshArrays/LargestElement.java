package com.Lokesh.LokeshArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int size = s.nextInt(); //  enter the size of the array.
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) { // enter array elements.
            arr[i] = s.nextInt() ;
        }
        int largest = arr[0];
        for (int j = 0; j < size; j++) {
            if(arr[j] > largest)
                largest = arr[j];
        }
        System.out.println(largest);

    }
}
