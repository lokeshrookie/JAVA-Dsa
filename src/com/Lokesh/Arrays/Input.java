package com.Lokesh.Arrays;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 11; // adding elements individually.
        int size = arr.length; // prints the array length.
        System.out.println("Array size is " + size);
        // loop to give input to the array using for loop
        System.out.println("Enter the elements to the array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] =  s.nextInt();
        }

        // loop to print the array elements
        System.out.println("printing elements using for loop");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println(" printin elements using for each loop");
        // enhanced for loop ( for each loop ) to print the array elements.
        for(int num: arr){  // for every element in the array, print the element
            System.out.println(num + " "); // here num represents element of the array.
        }
            s.close();
        System.out.println(Arrays.toString(arr)); // Arrays.toString() method is used to print the array. if we print normally, we get the address of the array as output.
    }
}
