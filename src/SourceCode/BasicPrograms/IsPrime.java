package SourceCode.BasicPrograms;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
//        for(int i = 1; i<=number; i++){
//            if(isArmstrong(i)){
//                System.out.println(i + "yes");
//            }
//        }
//        Boolean b = isPrime(number);
        System.out.println(isArmstrong(number));
//        System.out.println(b);
//        System.out.println(isArmstrong(number));
        s.close();
    }


    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = digit(n);

        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (int)Math.pow(rem, digits);
        }

        return sum == original;
    }

    private static int digit(int n) {
        int digits = 0;
        while(n > 0){
            n/=10;
            digits++;
        }
        return digits;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
