package SourceCode.Recursion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        int[] array = {11,22,33,44,55};
        System.out.println(findIndex(arr, 3 , 0));


        System.out.println(linear(arr, 3, 0));


        System.out.println(findIndexLast(array, 33, arr.length-1)); //checking from last


        System.out.println(findAllIndex(arr, 4,0));


        System.out.println(list);

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




    //Search from the last
    static int findIndexLast(int[] arr, int target , int index){
        if(index == -1){
            return  -1;
        }
        if(arr[index] == target){
            return  index;
        }
        else{
            return findIndexLast(arr, target, index-1);
        }
    }




    //find all the indices which matches the target
    static ArrayList<Integer> list  = new ArrayList<>( );
    static int findAllIndex(int[] arr, int target , int index){
        if(index == arr.length){
            return  -1;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1);
    }

}



