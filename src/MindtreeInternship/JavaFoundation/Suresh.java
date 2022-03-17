package MindtreeInternship.JavaFoundation;

import java.util.Scanner;

public class Suresh {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int x = s.nextInt();
        if(x == 0 || x == 1){
            System.out.println("not prime");
            return;
        }

        for(int i = 2; i<=x/2; i++){
            if(x%i == 0){
                System.out.println("not prime");
            }
        }
        System.out.println("prime");



    }
}
