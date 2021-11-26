package TESTER;


import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int[] arr = {24,232,2,1323,-23,0,32,-42323,35};
        int[] cycarr ={4,3,5,2,1,6};
//        System.out.println(Arrays.toString(bubble(arr)));
//        bubble(arr);
//        System.out.println(selection(arr));
//        System.out.println(selection(arr));
//        System.out.println(Arrays.toString(selection(arr)));

//        insertion2(arr);
//        bubble2(arr);
        System.out.println(Arrays.toString(arr));

//       insertion(arr);
//        System.out.println(Arrays.toString(arr));

//        cyclic(cycarr);
//        System.out.println(Arrays.toString(cycarr));

    }

    // BUBBLE SORT
    static void bubble(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1;j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
//                    int temp = arr[j];
//                    arr[j]  = arr[j-1];
//                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

        // SELECTION SORT
    static  void selection(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = maxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }
    private static int maxIndex(int[] arr, int first, int last) {
        int max = first; // assume first element be the max element.
        for(int i  = 0; i<=last; i++){ // iterate <=last because this is index.
            if(arr[max] < arr[i]){
                max = i; //    assign the i value to the max.
            }
        }
        return max;
    }

        // INSERTION SORT: In insertion sort, iterate upto arr.length-2
    static  void  insertion(int[] arr){
        for(int i = 0; i<arr.length-1; i++){  //
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }


    //SELECTION SORT
    static void cyclic(int[] arr){
//
        //if we use for loop, we have to leave inc/dec part empty.
        // and inc only when the if condition is not satisfied.

        // since we dont have to use inc/dec, we can use while loop.

        for(int i = 0; i<arr.length; ){ // leave inc part empty.
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i, correct);
            }
            else{
                i++;
            }
        }
//        int i = 0;
//        while(i<arr.length){
//            int correct = arr[i] - 1;
//            if(arr[i] != arr[correct]){
//                swap(arr, i, correct);
//            }
//            else{
//                i++;
//            }
//        }
    }











    private static void swap( int[] arr, int first, int second) { // first and second are indexes not elements.
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }




    static  void bubble2(int[] arr){
        for(int i = 0; i<arr.length; i++) {
            for(int j = 1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j ,j-1);
                }
            }
        }
    }

    static  void insertion2(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }


    static  void selectionSort2(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = maxIndex2(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static int maxIndex2(int[] arr, int first, int last) {
        int max = first;
        for(int i = first; i<=last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

}




























