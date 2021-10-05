package com.Lokesh.BasicInterviewQuestions;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  number = s.nextInt();
        System.out.println(isPalindrome(number));
    }
    static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while (num >0){
            int rem = num%10;
            num = num/10;
            reverse = reverse*10+rem;
        }
        return (original == reverse);
    }
}
