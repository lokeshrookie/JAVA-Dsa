package SourceCode.Arrays;

public class ReturnArrayInMethod{
//Java Program to return an array from the method
    //creating method which returns an array
    static int[] get(){
        return  (new int[]{1,2,3,4});
    }

//
    public static void main(String args[]){
//calling method which returns an array
        int arr[]=get();
//printing the values of an array
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }}