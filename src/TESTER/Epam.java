package TESTER;

import java.util.Scanner;

public class Epam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        // 2 4 1 2 == 1.
        int water = 0;
        int min = 0;
        int max = 0;

        int i = 1;
        while(i < arr.length-1){
            while(arr[i-1] > arr[i] && arr[i+1] > arr[i]) {
                max = Integer.max(arr[i - 1], arr[i + 1]);
//                int min = 0;
                if (max == arr[i - 1]) {
                    min = arr[i + 1];
                } else {
                    min = arr[i - 1];
                }
                water = water + ((max - min) - arr[i]);
                i++;
            }


        }
//        for(int i = 1; i<arr.length-1; i++){
//
//        }
        System.out.println(water);
    }
}
