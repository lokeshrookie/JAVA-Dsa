package SourceCode.Lokesh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter some input : ");
        int rollNo = input.nextInt();
        input.close();
        System.out.println("Your roll number is  " + rollNo);
    }
}
