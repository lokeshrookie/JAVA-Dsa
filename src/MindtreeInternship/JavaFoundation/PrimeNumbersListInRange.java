package MindtreeInternship.JavaFoundation;

import java.util.*;
public class PrimeNumbersListInRange {
    static boolean Prime(int n){
        if (n == 0 || n == 1) {
            return false;
        } if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if (Prime(i)){
                System.out.print(i + ", ");
            }
        }
    }
}
