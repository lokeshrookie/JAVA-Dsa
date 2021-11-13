package TESTER;

public class Pattern {
    public static void main(String[] args) {
        int n = 100;
//        String ch = "Lokesh";
        int  ch = 9;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n; j++) {
                System.out.print(ch + "   ");
                ch++;
            }
            System.out.println();
        }
    }
}
