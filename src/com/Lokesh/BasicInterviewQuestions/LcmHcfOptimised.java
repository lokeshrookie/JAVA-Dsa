package com.Lokesh.BasicInterviewQuestions;

public class LcmHcfOptimised
{
    public static void main(String[] args) {
        System.out.println(gcd(5, 1));
//        System.out.println(lcm(2, 7));
    }
    // gcd
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    //lcm using gcd
//    static int lcm(int a, int b) {
//        return a * b / gcd(a, b);
//    }
}

