package SourceCode.Math1;

import java.util.Scanner;

public class PrimesUptoN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int n = 40;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " +isPrime(i));
        }
    }

    private static boolean isPrime(int num) {
        for (int j = 2; j*j<=num; j++) {
            if(num%j == 0){
                return false;
            }
        }
        return true;
    }
}
