package com.Lokesh.Math1;

public class IsUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(isUnique(arr));
    }

    private static int isUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique = unique^n;
        }
            /*
            by XORing all the elements, since the XOR  is  1 only when both the elements are different,
             only 4 will be remained and all other duplicate elements cancelled by each other.
             The following operation will be done internally.
             */
//        unique = arr[0] ^ arr[1]^ arr[2] ^ arr[3] ^ arr[4] ^ arr[5] ^ arr[6];
        return unique;
    }
}
