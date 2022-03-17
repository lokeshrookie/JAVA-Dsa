package MindtreeInternship.JavaFoundation;

import java.util.*;

/** AreaOfGeometricForms **/

public class A2P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        switch (s) {
            case "triangle" -> {
                int b = sc.nextInt();
                int h = sc.nextInt();
                double ans = (0.5) * b * h;
                System.out.format("%.2f", ans);
            }
            case "square" -> {
                int s1 = sc.nextInt();
                double ans1 = s1 * s1;
                System.out.format("%.2f", ans1);
            }
            case "rectangle" -> {
                int l = sc.nextInt();
                int b1 = sc.nextInt();
                double ans2 = l * b1;
                System.out.format("%.2f", ans2);
            }
            case "circle" -> {
                int r = sc.nextInt();
                double ans3 = 3.14 * r * r;
                System.out.format("%.2f", ans3);
            }
        }
    }
}