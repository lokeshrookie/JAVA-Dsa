package methods;

public class addition {
    public static void main(String[] args) {
//        System.out.println(sum(54,98));
//        System.out.println(name("paw"));
//        name("pavan sankar");
//        name("lokesh");
//        swap(5,6);
//        isPrime(98);
        for(int i = 1; i<=100; i++){
            System.out.println(i + "  " + isPrime(i));

        }


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
        if(num <2){
            return false;
        }
        for(int i = 2; i <= num/2; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
