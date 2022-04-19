package Accenture;

import java.util.Scanner;

/** Good Sequence - ( sum == prime Factor sum) */

public class DP1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =  s.nextInt();
        if(sum(n) == sumPrime(n)){
            System.out.println(sum(n));
        }
        else {
            System.out.println(-1);
        }
//        System.out.println(sumPrime(n));
    }

    static int sum(int num){
        int sum = 0;
        while(num > 0 ){
            int rem = num/10;
            sum = sum + rem;
            num/=10;
        }
        return sum;
    }

    static int sumPrime( int number) {

        int counter;
        int sum = 0;
        for (counter = 2; counter <= (number / 2); counter++) {
            if (number % counter == 0) {
                sum = counter;
                counter++;
                sum += counter;
            }
        }
        return sum;
    }
}
