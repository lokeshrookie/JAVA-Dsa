package com.Lokesh.Sorting;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        sorting c = new sorting();
        int[] arr = {5,3,4,2,1,6};
//        c.cyc(arr);
//        sorting.select(arr);
//        sorting.cycl(arr);
        sorting.in(arr);
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

    static void insertion(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static  void select(int[] arr){
                    for(int i = 0; i<arr.length; i++){
                        int last = arr.length-i-1;
                        int max = maxInd(arr, 0, last);
                        int temp = arr[last];
                        arr[last] = arr[max];
                        arr[max] = temp;
                    }
    }

                private static int maxInd(int[] arr, int first, int last) {
                    int max = first;
                    for(int i = first; i<=last; i++){
                        if(arr[i] > arr[max]){
                            max = i;
                        }
                    }
                    return  max;
                }
    static  void cycl(int[] arr) {

//        int i = 0;
//        while(i<arr.length){
//            int correct = arr[i] - 1; //correct index = element - 1
//            if(arr[i] != arr[correct]){
//                int temp = arr[i];
//                arr[i] = arr[correct];
//                arr[correct] = temp;
//            }
//            else{
//                i++;
//            }
//        }
//        return  arr;

        for(int i = 0; i<arr.length;){
            int ci  = arr[i]-1;
            if(arr[i] != arr[ci]){
                int temp = arr[i];
                arr[i] = arr[ci];
                arr[ci] = temp;
            }
            else{
                i++;
            }
        }
    }

    static  void  in(int[] arr){
                    for(int i = 0 ; i<arr.length-1; i++){
                        for(int j = i+1; j>0; j--){
                            if(arr[j] < arr[j-1]){
                                int temp = arr[j];
                                arr[j] = arr[j-1];
                                arr[j-1] = temp;
                            }
                        }
                    }
    }
}




