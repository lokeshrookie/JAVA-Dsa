public class Fibo {
    public static void main(String[] args) {
//        fibo(10);
//        nthFibo(7);

    }
    private static void fibo(int numberToPrint){
        int num1 = 0;
        int num2 = 1;
        int numbersIWantToPrint = 10;
        System.out.println(num1);
        System.out.println(num2);
        for(int i = 0; i<numbersIWantToPrint;i++){
           int num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
    static void nthFibo(int n){
        int num1 = 0;
        int num2 = 1;
//        System.out.println(num1);
//        System.out.println(num2);
        // 0 1 1 2 3 5
        int num3 = 0;
        for(int i = 2; i<=n;i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
    }


}
