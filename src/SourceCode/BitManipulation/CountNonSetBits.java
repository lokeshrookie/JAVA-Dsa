package SourceCode.BitManipulation;

public class CountNonSetBits {
    public static void main(String[] args) {
        System.out.println(countNonSetBits(8));
    }
    private static int countNonSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n&1) == 0)
                count+=1;
            n>>=1;
        }
        return count;
    }
}
