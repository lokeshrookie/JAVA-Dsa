package SourceCode.Arrays.BareMinium;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    /* Method - 1*/
    private static void reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    /* Method 2 */
    public static int[] rev(int[] arr){
        int[] rev = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            rev[i] = arr[arr.length-i-1];
        }
        return rev;
    }
    /* Method - 3 Without Extra array (using temp variable)
    *   and formula( arr[i] will be replaced by arr[arr.length - i-1] */
    public static int[] reverseArray(int[] arr){
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i- 1];
            arr[arr.length -i -1] = temp;
//            arr[i] = arr[arr.length-i-1];
        }
        return arr;
    }




}

