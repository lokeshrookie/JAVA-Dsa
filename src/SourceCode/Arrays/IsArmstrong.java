package SourceCode.Arrays;

public class IsArmstrong {
    public static void main(String[] args) {

        /*

        No need to multiply the ans with 10 like as in palidrome

         */

        //Printing armstrong numbers below 1000

        for (int i = 0; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }

        }
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans  + (rem * rem * rem);
            n/=10;

        }
        return original == ans;
    }
}
