package MindtreeInternship.JavaFoundation;
import java.util.*;
public class A2P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si1 = s.nextInt();
        int si2 = s.nextInt();
        double[] first = new double[si1];
        double[] second = new double[si2];
        for(int i = 0; i<first.length; i++){
            first[i] = s.nextDouble();
        }
        for(int i = 0; i<second.length; i++){
            second[i] = s.nextDouble();
        }
        System.out.println(Arrays.toString(add(first,second)));
    }

        private static double[] add(double[] a, double[] b) {
            double[] c = new double[(int) Math.max(a.length, b.length)];
            for (int i = 0; i < c.length; i++) {
                if (a.length > i) {
                    c[i] += a[i];
                }
                if (b.length > i) {
                    c[i] += b[i];
                }
            }
            return c;
        }
}

