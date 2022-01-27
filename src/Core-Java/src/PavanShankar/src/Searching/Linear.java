package Searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int[] arr =  {3,4,5,7,6,2,1,0, -11,-23,-4, 99};
        Scanner s =  new Scanner(System.in);
        int target = s.nextInt();
        System.out.println(lsearch(arr, target));
    }
    static int lsearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return  i;
            }
        }
        return -1;
    }
}
