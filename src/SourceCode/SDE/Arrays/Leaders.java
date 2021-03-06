package SourceCode.SDE.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(leaders(arr));
    }

    /* Method - 1 */
    public static ArrayList<Integer> method(int[] arr){
//        int[] ans = new int[arr.length];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
            if(isLeader(arr, i)){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);
        return ans;
    }
    public static boolean isLeader(int[] arr, int first){
        for(int i = first; i<arr.length; i++){
            if(arr[first] < arr[i]){
                return false;
            }
        }
        return true;
    }

    /* Method - 2 */
    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length-1; i>=0; i--){
            if(isLeader(arr, i)){
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}


















