package com.Lokesh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt(); //this cannot take float values as input
        //float num = input.nextFloat(); // This can take int values as input
        //TYPE CASTING
        int num = (int) 65.55f; // COMPRESSING THE BIGGER NUMBER INTO A SMALLER ONE.
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte) a; // byte can store upto 256. so the output is 1
        System.out.println(b);
    }
}
