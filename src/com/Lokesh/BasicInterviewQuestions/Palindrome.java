package com.Lokesh.BasicInterviewQuestions;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  number = s.nextInt();
        System.out.println(isPalindromenumber(number));
        System.out.println("Enter a string: ");
        String  str = s.next();
        System.out.println(isPalindromeString(str));
        s.close();
    }


    static boolean isPalindromenumber(int num){
        int original = num;
        int reverse = 0;
        while (num >0){
            int rem = num%10;
            num = num/10;
            reverse = reverse*10+rem;
        }
        return (original == reverse);
    }


     static boolean isPalindromeString(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        String ans = sb.reverse().toString();
         StringBuilder sb = new StringBuilder();
         for(int i = str.length()-1; i>0 ; i++){
             sb.append(str.charAt(i));
         }
        return str.equals(sb);

    }


}
