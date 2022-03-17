package MindtreeInternship.JavaFoundation.DSA.Assignments;

import SourceCode.Arrays.StringArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays Assignment 1.
 */
public class A1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String[] arr = new String[size];
        for(int i = 0;i<arr.length; i++){
            arr[i] = s.next();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
