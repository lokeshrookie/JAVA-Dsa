package com.Lokesh.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class PrintStringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = new String[6];
        for (int i= 0; i <str.length; i++) {
            str[i] = s.next();
        }
        s.close();
    //    for (int i = 0; i < str.length; i++) {
            System.out.println(Arrays.toString(str));
    //    }
//        System.out.print( "[");
        for (int i = 0; i <str.length ; i++) {
            System.out.print(str[i] + " ") ;
        }//
    }
}
