package MindtreeInternship.JavaFoundation;

import java.util.Scanner;

public class A2P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        // taking inputs to the array
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        // calculating sum
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
