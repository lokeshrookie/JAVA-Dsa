package MindtreeInternship.JavaFoundation;

import java.util.Scanner;
/** Reverse Number **/
public class A2P5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int reverse = 0;
        while(number > 0){
            int lastDigit = number%10;
            reverse = reverse * 10 + lastDigit;
            number/=10;
        }
        System.out.println(reverse);
    }
}