import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
//        System.out.println(fib(num));
        for(int i = 0; i<num; i++){
            System.out.println(i +  " " + prime(i));
        }
    }
    static int  f(int num){
        if(num <=1){
            return 1;
        }
        else
            return num * f(num-1);
    }
    static int fib(int num){
        if(num <=1){
            return num;
        }
        return fib(num-1) + fib(num-2);
    }
    static boolean prime(int num){
        if(num<2){
            return false;
        }

        // in place of math.sqrt, we can use
        // i<=num/2  or i*i<=num
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

//    static boolean isArmstrong(int num){
//        int original = num;
//    }
//






















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
