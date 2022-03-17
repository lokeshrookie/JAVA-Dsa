package MindtreeInternship.JavaFoundation;

import java.util.Arrays;
import java.util.Scanner;

/** Multiplication of two matrix **/
public class A3P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] first = new int[size];
        int[] second = new int[size];
        for(int i = 0; i<first.length; i++){
            first[i] =s.nextInt();
        }
        for(int j = 0; j<second.length; j++){
            second[j] = s.nextInt();
        }
        for(int k = 0; k<size; k++){
            first[k] =  first[k]*second[k];
        }
        System.out.println(Arrays.toString(first));
    }
}
