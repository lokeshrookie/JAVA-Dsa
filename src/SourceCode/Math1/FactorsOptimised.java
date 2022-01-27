package SourceCode.Math1;

public class FactorsOptimised {
    public static void main(String[] args) {
        factors(100);
    }
    static  void factors(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                System.out.print(i + " " + n/i + " ");
                //it will print first factor and last factor, 2nd factor and 2nd last factor, ....

            }
        }
        // use arraylist to sort the elements
    }
}


/*
Output: 1 100 2 50 4 25 5 20
 */