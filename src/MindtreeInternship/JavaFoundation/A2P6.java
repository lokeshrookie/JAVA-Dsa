package MindtreeInternship.JavaFoundation;

import java.util.Scanner;

/** Prime **/
public class A2P6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(isPrime(number));
    }

    static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i<=number/2; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}

