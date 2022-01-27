import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        /* In each iteration, the next largest element will be bubble up
            and move to the last index. */
        for(int i = 0; i<arr.length; i++){
            /*
             Inner loop is used to compare every two items of the array.
             if the present element is smaller than the previous element,
             then both elements will be swapped.
            */
            for(int j = 1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
