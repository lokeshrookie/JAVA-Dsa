package com.Lokesh.BasicPrograms;

/**
 * 1. take two numbers as  input.
 * 2. if any one of them are 0.then lcm will be 0
 * 3. else lcm = max(a,b)
 * 4. Inseide the while loop(TRUE) if(lcm divides both a and b.
 *    then return lcm. else check for next number by incrementing the lcm.
 *
 */

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(lcm(a,b));
    }

    private static int lcm(int a, int b) {
        int max = Math.max(a,b);
        int lcm = max;
        if(a == 0 || b == 0){
            return 0;
        }

        while (true){
            if(lcm%a  == 0 && lcm%b == 0){
                return lcm;
            }
            else{
                lcm++;
            }

        }
    }
}
