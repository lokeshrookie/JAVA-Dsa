package com.Lokesh.Sorting;
//Selection sort
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1,44,64,8,35,77};
        int temp = 0;
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j <a.length-1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if(min != a[i] ){
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");

        }
    }
}
