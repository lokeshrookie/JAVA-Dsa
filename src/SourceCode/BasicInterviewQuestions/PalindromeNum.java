package SourceCode.BasicInterviewQuestions;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        //    fibonacci series
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPalindrome(n));
    }


    private static boolean isPalindrome(int n) {
        int original = n;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans * 10 + rem;
            n = n/10;

        }

        return original==ans;
    }
}
