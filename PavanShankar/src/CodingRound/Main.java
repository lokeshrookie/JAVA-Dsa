package CodingRound;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(con(size, arr));

    }
    static int con(int input1, int[] input2){
        for(int i = 0; i< input1 -1; i++){
            if(input2[i]+1 != input2[i+1]){
                return 0;
            }
        }
        return 1;
    }
}
