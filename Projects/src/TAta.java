import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;

public class TAta {
    public static void main(String[] args) {
//        System.out.println(find(16));
//        System.out.println(countBits(8));
        String s = "101";
//        System.out.println(9&1);
        System.out.println(countBits(5));

    }
    static int countBits(int n){
        int count =0;
        while(n > 0){
            count+=1;
            n>>=1;
        }
        return count;
    }

    static String CountBits(int n){
        int count = 0;
        String bits = "";
        for(int i = 1; i<=n; i++){
            if((n&1) == 1){
                bits = bits.concat("1");
            }
            else{
                bits = bits.concat("0");
            }
            count++;
            n = n>>1;
        }
        System.out.println("Count : " + count);
        return bits;
    }

    static  int find(int input1){
        int ans = 0;
        for(int i = 1; i<=input1; i++){
            if(Integer.toBinaryString(i).contains("111")){
                ans = ans + i;
            }
        }
        return ans;
    }
}
