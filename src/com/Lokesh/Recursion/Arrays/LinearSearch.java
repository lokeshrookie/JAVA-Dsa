package com.Lokesh.Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findIndex(arr, 3 , 0));
        System.out.println(linear(arr, 3, 0));
//        if(linear(arr, 4, 0)){
//            System.out.println(findIndex(arr,3,0));
//        }
//        else{
//            System.out.println("not found");
//        }

    }
    static  boolean linear(int[] arr , int target , int index){
        if(index == arr.length){
            return  false;
        }
        return arr[index]  == target || linear(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target , int index){
        if(index == arr.length){
            return  -1;
        }
        if(arr[index] == target){
            return  index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
}
