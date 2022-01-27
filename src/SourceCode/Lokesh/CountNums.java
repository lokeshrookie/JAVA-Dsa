package SourceCode.Lokesh;
import java.util.Scanner;
public class CountNums {
    // to count number of times a digit is occurred in a number.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  num = 123345;
        int count = 0;
        s.close();
        while (num>0){
            int rem = num%10;// to check the last number is 3 or not.
            if(rem == 3){
                count++; //count will store the number no times 3 is occurred.
            }
            num = num/10; // to remove the last number
        }
        System.out.println(count);
    }
}
