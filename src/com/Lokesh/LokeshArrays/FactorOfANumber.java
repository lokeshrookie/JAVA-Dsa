package com.Lokesh.LokeshArrays;

import java.util.*;

public class FactorOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for(int i = 1; i<=number; i++){
            if(number%i == 0 ){
                System.out.println(i + " ");
            }
        }
    }
}