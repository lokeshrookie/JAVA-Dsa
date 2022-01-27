package SourceCode.CodeChef;

import java.util.Scanner;

public class CHEAPFUEL {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int T = s.nextInt();
//        int X,Y,A,B,K;
//        while(T>0){
//            X = s.nextInt(); // petrol price
//            Y = s.nextInt(); // diesel price
//            A = s.nextInt(); // A*K
//            B = s.nextInt(); // B*k
//            K = s.nextInt();
//
//            if(A*K == B*K){
//                System.out.println("SAME PRICE");
//            }
//            else if(A*K > B*K){
//                System.out.println("PETROL");
//            }
//            else if(A*K < B*K){
//                System.out.println("Diesel");
//            }
//
//            T--;
//        }
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test > 0){
            int X = input.nextInt();
            int Y = input.nextInt();
            int A = input.nextInt();
            int B = input.nextInt();
            int K = input.nextInt();

            int petrol_price = X + (A * K);
            int diesel_price = Y + (B * K);

            if (petrol_price < diesel_price){
                System.out.println("PETROL");
            }
            else if (diesel_price < petrol_price){
                System.out.println("DIESEL");
            }
            else{
                System.out.println("SAME PRICE");
            }
            test--;
        }
    }
}
