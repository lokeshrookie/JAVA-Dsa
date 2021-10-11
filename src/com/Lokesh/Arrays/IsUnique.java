package com.Lokesh.Arrays;

public class IsUnique {
    public static void main(String[] args) {
        int arr[] = {2,8,3,5,66,88};
        System.out.println(isUnique(arr));
    }
    static boolean isUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    
}
