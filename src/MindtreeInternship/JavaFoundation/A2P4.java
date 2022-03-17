package MindtreeInternship.JavaFoundation;

import java.util.Scanner;
/** Max of three numbers**/
public class A2P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int largest = Math.max(num1, num2);
        largest = Math.max(largest, num3);
        System.out.println(largest);
    }
}
