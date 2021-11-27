package TESTER;

import java.util.Arrays;

public class MultiThreading {
    public static void main(String[] args) {
        int[] arr = {231,2342,-23,0,-232,-1,-978565, 90993};
        int[] ans = ms(arr);
        System.out.println(Arrays.toString(ans));
    }

     static int[] ms(int[] arr) {
//        int length = arr.length;
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = ms(Arrays.copyOfRange(arr, 0, mid));
        int[] right = ms(Arrays.copyOfRange(arr, mid, arr.length));

        ms(left);
        ms(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int l = 0; // left arry
        int r = 0; //right
        int m = 0; // merged array

        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                mix[m] = left[l];
                l++;
            }
//            if(right[r]< left[l]){
            else {
                mix[m] = right[r];
                r++;
            }
            m++;
        }

        // some elements may not be added to the merged ayy
        while(l < left.length){
            mix[m] =left[l];
            l++;
            m++;
        }
        while (r < right.length){
            mix[m] = right[r];
            r++;
            m++;
        }
        return mix;
    }
}


