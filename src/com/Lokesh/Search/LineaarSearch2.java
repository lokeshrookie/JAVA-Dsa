package com.Lokesh.Search;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.*
 ******************************************************************************/

import java.util.Scanner;
class LinearSearch2
        {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("----------------------LINEAR SEARCH--------------------");
        System.out.println("Enter the nubmer of elements: ");
        int arr[] = new int[s.nextInt()];
        System.out.println("Enter the elements of the array : ");
        //loop for insertion.
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = s.nextInt();
        // loop for searching.
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target found at  index :"  + i );
                break;
            }
            if(arr[i] == arr.length){
                System.out.println("Target not found");
            }

        }
    }
}
