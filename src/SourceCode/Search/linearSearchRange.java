package SourceCode.Search;
//Linear Search to find at element in the given range of Index
import java.util.Scanner;
public class linearSearchRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {  1, 2, 3, 4, 5, 6, 7, 8, 9 };// arr containing 1 to 9 numbers
        System.out.println("Enter the target : ");
        int target = s.nextInt(); //take input to search
        System.out.println("Enter the range( min & max) to search");
        int min = s.nextInt();
        int max = s.nextInt();
        s.close();
        int ans =  linearSearch(nums, target, min , max);
        System.out.println(ans);

    }
    static  int linearSearch(int[] arr, int target, int min, int max){

        if(arr.length == 0){
            return -1;
        }

        for(int index = min; index<max; index++){
            int element = arr[index];
            if (target  == element){ // if target is matched with any element, returns index.
                return  index;
//                return element;
            }

        }

        return -1;
    }
}
