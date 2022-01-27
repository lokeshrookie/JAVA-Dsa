package SourceCode.Search;
//Linear Search
import java.util.Scanner;

public class LinearJet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter an element to search");
        int target = s.nextInt();
        s.close();
        for (int i = 0; i < arr.length; i++) {
//            if(arr.length == 0){
//                return -1;
//            }

            if(arr[i] == target){
                System.out.println("Target is found at index: " + i);
                break;
            }
        }
    }
}
