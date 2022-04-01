package Accenture;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Vandhana1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  string: ");
        String str = s.nextLine();
        System.out.println("Enter char to remove: ");
        String  ch = s.next();
        RemoveOccurances(str, ch);
    }

    static void RemoveOccurances(String input1, String input2){
        String ans = "";
        char ch = input2.charAt(0);
        for(int i = 0; i<input1.length(); i++){
            if(input1.charAt(i) ==  ch){
                continue;
            }
            ans = ans + input1.charAt(i);
        }
        System.out.println(ans);
    }
}