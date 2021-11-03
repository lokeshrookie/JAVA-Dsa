package com.Lokesh.Math1;

public class FactorsOptimised {
    public static void main(String[] args) {
        factors(30);
    }
    static  void factors(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                System.out.println(i + " " + n/i);
                //it will print first factor and last factor, 2nd factor and 2nd last factor, ....
            }
        }
    }
}
