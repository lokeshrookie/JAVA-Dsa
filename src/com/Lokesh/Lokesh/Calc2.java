package com.Lokesh.Lokesh;
import java.util.Scanner;
public class Calc2 {
    public static int main(String[] args) {
        Scanner s = new Scanner(System.in);
        double  ans = 0;
        while(true){
            System.out.println("Enter two numbers");
             double num1 = s.nextDouble();
             double num2 = s.nextDouble();
             System.out.println("Enter an Operator");
             s.close();
            char op = s.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                else if(op == 'x' || op == 'X') {
                    return 0;
                }

            }
                    System.out.println(ans);
        }


    }
}
