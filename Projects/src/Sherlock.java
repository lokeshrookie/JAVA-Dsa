import java.util.Scanner;

public class Sherlock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        for(int i = 0; i<=num; i++){
            if(isSher(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    static  boolean isSher(int n){
        return n % 2 == 0;
    }
}
