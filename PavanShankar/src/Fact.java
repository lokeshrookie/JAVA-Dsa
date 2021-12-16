import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(factorial(num));
    }

    private static int fact(int num) {
        if(num == 0){
            return 1;
        }
        return num*fact(num-1);
    }
    static int factorial(int num){
        int ans = 1;
        while(num>0){
            ans = ans * num;
            num--;
        }
        return ans;
    }

}
