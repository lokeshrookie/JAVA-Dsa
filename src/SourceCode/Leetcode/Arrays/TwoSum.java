package SourceCode.Leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2,7,11,15};
        System.out.println("Enter the target: ");
        int target = s.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i<arr.length; i++){
            if(hm.containsKey(target - arr[i])){
                return new int[]{i, hm.get(target-arr[i])};
            }
            else{
                hm.put(arr[i],i);
            }
            System.out.println(hm);
        }
        return new int[]{0,0};
    }

}
