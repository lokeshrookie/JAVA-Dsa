package com.Lokesh.Arrays;
import java.util.*;
public class ArrayDeletion
{
	public static void main(String[] args) {

int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int index = 3;
System.out.println(remove(array, index));
	}
	static String remove(int arr[], int index){
	    for(int i = index; i<=arr.length-1; i++){
	    	if(i == arr.length - 1){
	    		continue;
			}
	        arr[i] = arr[i+1];
	    }
	    return Arrays.toString(arr);
	}
}




