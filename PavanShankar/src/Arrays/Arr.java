package Arrays;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[6];
        // length = 6 ==> 0 1 2 3 4 5
        // array last index = arr.length -1

        // loop to take inputs
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        System.out.println(minIndex(arr));

//        System.out.println(Arrays.toString(arr));
        //print
        // loop to print elements of an array in reverse order.
//       for (int i = arr.length-1; i >= 0; i--){
//           System.out.println((arr[i]));
//       }
       //min of an array
//        int min=0;
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimum value is: " + min);

    }

    public static int minIndex(int[] arr){
        int min = 0;
       for(int i = 0; i < arr.length; i++){
           if (arr[min] > arr[i]){
               min = i;
           }
       }
       return min;
    }


}
