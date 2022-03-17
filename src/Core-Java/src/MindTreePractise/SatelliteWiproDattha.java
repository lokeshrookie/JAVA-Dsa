package MindTreePractise;

import java.util.*;
public class SatelliteWiproDattha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(method(arr));

    }
    public static int method(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){
                count++;
            }
        }
        return count;
    }

}
