package com.Lokesh.BasicPrograms;
import java.util.Scanner;
/**
 * 1. take two numbers as  input.
 * 2. if any one of them are 0.then lcm will be 0
 * 3. else lcm = max(a,b)
 * 4. Inside the while loop(TRUE) if(lcm divides both a and b.
 *    then return lcm. else check for next number by incrementing the lcm.
 *
 */
public class Lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(lcmm(a,b));
    }

    private static int lcm(int a, int b) {
        if(a == 0 || b == 0){
            return 0;
        }
        int lcm = Math.max(a,b);
        while (true){
            if(lcm%a  == 0 && lcm%b == 0){
                return lcm;
            }
            else{
                lcm++;
            }

        }
    }
    private static int lcmm(int a, int b){
        if(a == 0|| b == 0){
            return 0;
        }
        int lcm = Math.max(a,b);
        while(true){
            if(lcm%a == 0 && lcm%b == 0){
                return lcm;
            }
            else{
                lcm++;
            }
        }
    }
}
