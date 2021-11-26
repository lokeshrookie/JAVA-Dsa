package TESTER;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, -1, 0, -268};
//        mergeSortInPlace(arr, 0, arr.length);
//        mergeSort(arr);
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // creates new arry of size(mid) and passes to mergeSort method.
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // new arry size = arr.length - mid.

        return merge(left, right);

    }


    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0; // left array
        int j = 0; // right array pointer
        int k = 0; // mix array

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // add remaining elemetns to the array
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
