package SourceCode.Recursion.Arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //sorted
        int[] arr3 = {1,2,324,2452,42,55,2,1};   //unsorted
        System.out.println(srotedOrNot(arr3, 0));
        System.out.println(srotedOrNot(arr, 0));

    }

    static  boolean srotedOrNot(int[] arr , int index){
        if(index == arr.length - 1){
            return  true;
        }

        return  arr[index]  < arr[index + 1] && srotedOrNot(arr,index+1);

    }
}