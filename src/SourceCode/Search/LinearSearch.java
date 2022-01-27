package SourceCode.Search;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {  1, 2, 3, 4, 5, 6, 7, 8, 9 };// arr containing 1 to 9 numbers
        int target = s.nextInt(); //take input to search
       int ans =  linearSearch(nums, target);
        System.out.println(ans);
        s.close();
    }
    static  int linearSearch(int[] arr, int target){
         if(arr.length == 0){
             return -1;
         }
         for(int index = 0; index<arr.length; index++){
             if (target  ==arr[index]) { // if target is matched with any element, returns index.
                 return  index;
             }
         }
            return -1;
    }
}
