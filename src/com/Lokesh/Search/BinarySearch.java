package com.Lokesh.Search;
import java.util.Scanner;
public class BinarySearch {
    static int Search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid])
                end = mid -1;
            else if(target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;

    }// end of BinarySearch Function
    //main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int[] nums = {-23, -21, -4, 0, 3, 43, 566, 343, 6345};
        int ans = Search(nums, target);
        System.out.println(ans);
    }
}
