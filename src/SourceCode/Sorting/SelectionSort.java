package SourceCode.Sorting;

import java.util.Arrays;

//Selection sort
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {68687, 1, -232, 0, -342, 44,64,8,35,77};
//        int[] a = { 0, 1, 3, 6,-1121,0, -52, 12};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j <a.length; j++) {
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
        System.out.println(Arrays.toString(a));
    }
}
