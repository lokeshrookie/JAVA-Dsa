package com.Lokesh.Math1.BitManipulation;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(isOdd(number));

    }

    private static  boolean isOdd(int number) {
        return (number&1) == 1;
    }
}
