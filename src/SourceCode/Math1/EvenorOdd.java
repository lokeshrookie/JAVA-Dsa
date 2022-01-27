package SourceCode.Math1;

public class EvenorOdd {
    public static void main(String[] args) {
        int num = 565;
        System.out.println(ans(num));
    }

    private static boolean ans(int num) {
        return ((num&1) == 1);
        //if lsb of num(2^0) is 1, then  "&" of lsb and 1 will be 1. this means the number is odd.
        //Here we only consider last digit of the number.
    }
}
