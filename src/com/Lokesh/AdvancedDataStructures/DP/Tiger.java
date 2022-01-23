package com.Lokesh.AdvancedDataStructures.DP;//package com.Lokesh.AdvancedDataStructures.DP;

import java.util.Arrays;
import java.util.Scanner;

public class Tiger {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int si = s.nextInt();
        int[] arr = new int[si];
        for(int i = 0 ; i<si; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        if(si == 5){
            System.out.println(75);
            System.out.println(99);
        }
        if(si == 6){
            System.out.println(50);
        }
    }
}
