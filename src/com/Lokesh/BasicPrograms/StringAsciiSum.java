package com.Lokesh.BasicPrograms;

import java.util.Scanner;

public class StringAsciiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        int sum = 0;
        int a ;
        for (int i = 0; i < s.length(); i++) {
             a = s.charAt(i);
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
