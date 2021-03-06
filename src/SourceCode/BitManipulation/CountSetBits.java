package SourceCode.BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
//        System.out.println(count(7));
        System.out.println(countSetBits(9));
    }
    // count set bits using while loop
    private static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            count = count + (n&1); // bracket mukyam bigulu.
            // alternative for above line==> count+=n&1;
            n = n>>1; // for removing last digit.
        }
        return count;
    }
    private static int countBits(int n){
        int count = 0;
        while(n > 0){
            count = count + 1;
            n>>=1;
        }
        return count;
    }

    //count no of bits using for loop.
    private static int count(int n ){
        int count;
        for(count = 0;  n>0; ){
            count+=1;
            n>>=1;
        }
        return count;
    }
}
