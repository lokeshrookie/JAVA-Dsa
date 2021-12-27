package com.Lokesh.BasicInterviewQuestions;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
//        int b = s.nextInt();
        System.out.println(palin(a));

    }

    private static int lcm(int a, int b) {
        if(a == 0 || b == 0){
            return 0;
        }
        int lcm = Math.max(a,b);
        while(true){
            if(lcm%a == 0 && lcm%b == 0){
                return lcm;
            }
            else
                lcm++;
        }
    }

    static int hcf(int a, int b){
        if(a == 1 || b == 1){
            return 1;
        }
        int hcf = Math.min(a,b);
        while (true){
            if(a%hcf == 0 && b%hcf == 0){
                return hcf;
            }
            else
                hcf--;
        }
    }

    static boolean palin(int num){
        int original = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            rev = rev * 10 + rem;
        }
        return rev == original;
    }


}
