package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        if(year%400 == 0){
            return true;
        }
        else if(year%4 == 0 && year%100 != 0){
            return  true;
        }
        return false;
    }
}
