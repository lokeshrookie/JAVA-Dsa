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

class  Ms{
    public static void main(String[] args) {
        int[] arr = {231,2342,-23,0,-232,-1,-978565, 90993};
        int[] ans = ms(arr);
    }

    private static int[] ms(int[] arr) {
        int length = arr.length;
        if(arr.length <=1){
            return arr;
        }
        int mid = length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid-1, length-1);

        ms(left);
        ms(right);

        return merge(arr, left, right);
    }

    private static int[] merge(int[] arr, int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int l = 0; // left arry
        int r = 0; //right
        int m = 0; // merged array

        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                mix[m] = left[l];
                l++;
            }
            if(right[r]< left[l]){
                mix[m] = right[r];
                r++;
            }
            m++;
        }

        // some elements may not be added to the merged ayy
        while(l < left.length){
            mix[m] =left[l];
            l++;
            m++;
        }
        while (r < right.length){
            mix[m] = right[r];
            r++;
            m++;
        }
        return mix;
    }
}




















