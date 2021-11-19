package TESTER;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //linearSearch
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int target = s.nextInt();
//        System.out.println(linear(arr,target));
        System.out.println(binary(arr,target));
    }

    private static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return  mid;
            }
            else if(target < mid){
                end = mid -1;
            }
            else
                start = mid + 1;
        }
        return  -1;

    }


//    private static int linear(int[] arr, int target) {
//        int i ;
//        for ( i = 0; i < arr.length; i++) {
//
//            if(target == arr[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
}
