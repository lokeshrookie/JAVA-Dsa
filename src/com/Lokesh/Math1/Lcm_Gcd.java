package com.Lokesh.Math1;

public class Lcm_Gcd {
    public static void main(String[] args) {
        System.out.println("gcd is: "+ gcd(44,22));
        System.out.println("LCM is : "+ lcm( 4,8));
    }
    static int gcd(int a ,int b)
    {
        if(a == 0 ){
            return b;
        }
        return gcd(b%a, a);
    }
    static  int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
