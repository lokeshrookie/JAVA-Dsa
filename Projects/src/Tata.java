import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;

// Tata Elixs.. coding question pavan sankhar
//Q: print sum of all the magic numbers within the limit.
//   where magic number should have only 3 set bits in its binary representation.
public class Tata {

    public static void main(String[] args) {
        int sum = 0;
        int n = 12;
        for(int i = 1; i<=n; i++){
            if(countSetBits(i) == 3){
                sum+=i;
            }
        }
        System.out.println(digits(n));
    }

    static int countBits(int n){
        int count =0;
        while(n > 0){
            count+=1;
            n>>=1;
        }
        return count;
    }

    private static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }








    static String digits(int n ){
        String bits = "";
        int count = 0;
        while(n > 0){
            count++;
            bits = bits + (n&1);
            n>>=1;
        }
        return String.valueOf(bits);
    }





}
