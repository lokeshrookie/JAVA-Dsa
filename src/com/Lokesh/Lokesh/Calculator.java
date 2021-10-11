package com.Lokesh.Lokesh;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            //Take input from user until user does not enter x or X
        int ans = 0; // ans will print the result
        while(true){
            //take the character input
            System.out.println("Enter the operator: ");
            char op  = s.next().trim().charAt(0);
            // generally next() is for string types.
            // trim() will remove the empty spaces before the string . as we will enter only 1 character as op . it wil become char type.
                if (op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
               // if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
                //input two numbers
                System.out.println("Enter two numbers: ");
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            s.close();
                if(op == '+'){
                    ans = num1 + num2 ;
                }
                if(op == '-'){
                    ans  = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
                if(op == '/'){
                    ans = num1/num2;
                }
            }  // end of outer if statement
            else if(op == 'x' || op == 'X'){
                    break;
                }
                else {
                    System.out.println("invalid operator ");
                }
            System.out.println(ans);
        }//end of while loop
    }
}
