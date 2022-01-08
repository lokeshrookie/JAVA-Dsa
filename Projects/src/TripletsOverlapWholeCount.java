import java.util.Scanner;

public class TripletsOverlapWholeCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        int pair = 0;
        for(int i = 0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                pair++;
            }
        }
        pair = pair*2;
        int total = A.length() + B.length();
        float ans = (pair*100)/total;
        System.out.println((int)ans);
    }
}
