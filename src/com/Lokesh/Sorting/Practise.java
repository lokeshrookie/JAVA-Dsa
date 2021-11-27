package com.Lokesh.Sorting;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        sorting c = new sorting();
        int[] arr = {5,3,4,2,1,6};
        c.cyc(arr);
        System.out.println(Arrays.toString(arr));
    }
}



class sorting {
    static  int a = 5;
    public static void cyc(int[] arr){
        // int the range
        for(int i = 0; i<arr.length; i++){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int tmep = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tmep;
            }
        }


    }
}
