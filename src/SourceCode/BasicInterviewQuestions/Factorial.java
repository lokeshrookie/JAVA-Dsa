package SourceCode.BasicInterviewQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
    }
    // iterative way
    static int factorial (int n){
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }
    // recursive way
    private static int fact(int n) {
        if(n < 2 ) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
