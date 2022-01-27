package wrapperClasses;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = (a>b&&a>c)?a:((b>a&&b>c)?b:c);
        System.out.println(max);

    }
}
