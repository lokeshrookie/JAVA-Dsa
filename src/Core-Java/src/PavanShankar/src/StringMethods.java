import java.util.Scanner;


public class StringMethods {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long num1 = 10000;
        long num2 = 4335;
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num2,num1));
        System.out.println(Math.sqrt(num1));
    }


}
