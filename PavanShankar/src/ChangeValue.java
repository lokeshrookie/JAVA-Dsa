import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = new int[5];
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void change(int[] arr) {
        arr[0] = 6;
    }
}

// primitives and objects
