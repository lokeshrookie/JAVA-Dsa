package MindtreeInternship.JavaFoundation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(optimalArrangement(arr, arr.length)));
    }

    /** 3 4 5 1 1 => 3 4 9 10 14
     * **/


    static int[] optimalArrangement(int[] arr, int n)
    {
        // Auxiliary array to hold modified array
        int temp[] = arr.clone();

        // Indexes of smallest and largest elements
        // from remaining array.
        int small = 0, large = n - 1;

        // To indicate whether we need to copy remaining
        // largest or remaining smallest at next position
        boolean flag = true;

        // Store result in temp[]
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }
        return  arr;
    }
//    static int method(int[] arr){
//        int[] ans = new int[arr.length];
//        ans[0] = arr[0];
//        int temp = arr[0];
//        for(int i = 1; i<arr.length; i++){
////            ans[i] = arr[i] + arr[i-1];
//            temp = temp + arr[i];
////            ans[i] =  arr[i-1] + arr[i];
//            ans[i] = temp;
//
//        }
//
//        System.out.println(Arrays.toString(ans));
//        return 0;
//    }
}
