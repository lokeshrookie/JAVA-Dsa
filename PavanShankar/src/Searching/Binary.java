package Searching;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {-34, -4, 0,1, 2, 3,4,5};
//        int target = 4;
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        System.out.println(bsearch(arr,target));
    }

    private static int bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return  -1;
    }
}
