package SourceCode.Lokesh;
import java.util.Scanner;

public class ContinuousSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, input;
        do {
            System.out.print("Enter a number (Press 0 to exit): ");
            input = in.nextInt();
            sum += input;
            
        }while(input != 0);
        in.close();
        System.out.println("Total sum is : "+sum);

    }
}