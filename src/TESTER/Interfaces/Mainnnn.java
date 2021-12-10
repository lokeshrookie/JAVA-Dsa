package TESTER.Interfaces;

final class TesterClass {
    static  int a = 5;
    static char ch;
}
class Mai{
    TesterClass tc = new TesterClass();
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c);
    }
}
