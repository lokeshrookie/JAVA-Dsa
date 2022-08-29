package SourceCode.Leetcode.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }

}
