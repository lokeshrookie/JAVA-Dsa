package MindTreePractise;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class MathPractise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
//        int a  = s.nextInt();
//        int b = s.nextInt();
//        System.out.println(lcm(a,b));
        System.out.println(leap(num));
    }
    static void perfect(int num){
        int sum = 0;
        for(int i = 1; i<=num/2; i++){
            if(num%i == 0){
                sum = sum+i;
            }
        }
        if(num == sum){
            System.out.println(num + " is perfect");
        }
    }

    static boolean strong(int num){
        int original = num;
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            num/=10;
            ans = ans + fact(rem);
        }
       return ans == original;
    }
    static  int fact(int num){
        if(num <=1){
            return 1;
        }
        return num* fact(num-1);
    }

    static int leap(int num){

        int count = 0;
        for(int i = 1; i<=4; i++){
                if(num%400 == 0 || (num%4 == 0 && num%100 != 0)){
                    System.out.println("leap");
                    System.out.println(" extra added years is: " + count);
                    System.exit(0);
                }
                else{
                    count++;
                    num = num + 1;
            }
        }
            return -1;
    }



}
