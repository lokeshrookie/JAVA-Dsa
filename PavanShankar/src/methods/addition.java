package methods;

public class addition {
    public static void main(String[] args) {
        System.out.println(sum(54,98));
//        System.out.println(name("paw"));
//        name("pavan sankar");
//        name("lokesh");
//        swap(5,6);
//        isPrime(98);
        System.out.println(isPrime(98));


    }
    static int sum(int a, int b){
        return a+b;
    }

    static void name(String name){
        System.out.println("My name is " + name);
    }
    static void swap(int number1, int number2){
        int temp;
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(number1 + " " + number2);
    }
    static boolean isPrime(int num){
        int count = 0;
        for(int i = 2; i <= num; i++){
            if (num%i == 0){
                count++;
            }
        }
        return count!=0;
    }
}
