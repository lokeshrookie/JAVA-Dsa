package com.Lokesh.Recursion;
//prints numbers upto 10
public class Example {
    public static void main(String[] args) {
        print(1);
    }

    static  void print(int n){
        System.out.println(n);
        //below line is base condition
        if(n==10){
            return;
        }
        //This is tail recutsion
         print(n+1);
    }

    /* another way
    static  void print(int n){
        if(n==6){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }*/
}
