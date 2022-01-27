import java.util.Scanner;

public class UpperAndLowerBound {
    // upper and lower bounds
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int j : arr) {
            if (num1 <= j && j <= num2) {
                count++;
            }
        }
        System.out.println(count);

    }
}
