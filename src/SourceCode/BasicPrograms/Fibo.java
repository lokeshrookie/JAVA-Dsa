package SourceCode.BasicPrograms;

public class Fibo {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 7, c = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;


        }
//        System.out.println(b);
    }
}
