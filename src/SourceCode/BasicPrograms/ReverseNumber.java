package SourceCode.BasicPrograms;

/*Algorith:
1. Take number, answer to store reverse Number, rem to transfer digits from number to answer
2. transfer will be continued until the number becomes zero.
3. Multiply answer with 10 every time to place the new digit in Units Place.
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long Number = s.nextInt();
        long ans = 0; // ans to store reversed number
        long rem = 0;
        s.close();
        while(Number > 0 ){
            rem = Number%10;
            ans =  ans * 10 + rem;
            Number = Number/10;
//            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
