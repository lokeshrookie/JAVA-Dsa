package com.Lokesh.Lokesh;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num  = s.nextInt();
        int ans = 0; // this "ans will store the reversed number

        while(num>0){
            int rem = num % 10; // last digit saved to rem
            num = num/10; //Removing the last digit from the number
            ans = ans * 10 + rem; // to place to new rem to the left side of ans;
            // we are multiplying the ans * 10.
        }
        System.out.println(ans);

    }
}
// int num = 12345;

