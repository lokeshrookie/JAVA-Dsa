package SourceCode.Math1;

import java.util.Scanner;

public class PrimeOptimised {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num  = s.nextInt();
        System.out.println(isPrime(num));
    }
    private static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for (int i = 2; i*i<=num ; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
