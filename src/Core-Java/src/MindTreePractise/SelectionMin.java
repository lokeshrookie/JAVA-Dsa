package MindTreePractise;

import java.util.Arrays;

/** In selection sort, we will take the min element (or max) and swap it with the first element in the sorted part.
 *  first element will be 'i' which will ve updated in every iteration.
 *
 *  1. we visualise the original array as two imaginary parts.
 *  2. If we take min, the left right hand side array is unsorted array and
 *      left hand side is sorted array.
 *  3. For every iteration, we will take the min element from the unsorted array and
 *      swap it with the first element(ith element) in the sorted array .
 *  4. The final array is sorted array.
 *
 * In every iteration, we have to take the index with min element and swap it with the first element.
 *  first element for the nth iteration is n.
 *
 */
public class SelectionMin {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i = 0; i<arr.length; i++){
//            int first = i;
            // i is the first element in every iteration.

            int min = minIndex(arr, i, arr.length-1);
            swap(arr, i, min);
        }
    }

    private static void swap(int[] arr, int first, int min) {
        int temp = arr[first];
        arr[first] = arr[min];
        arr[min] = temp;
    }

    private static int minIndex(int[] arr, int first, int last) {
        int min = first;
        for(int i = 0; i<=last; i++){
            if(arr[i] <=arr[first]){
                min = i;
            }
        }
        return  min;
    }
}
