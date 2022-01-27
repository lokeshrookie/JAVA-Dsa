package SourceCode.Arrays;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Lokesh ";
        names[1] = " Ram ";
        change(names);
        int[] numbers = new int[5];
        numbers[1] = 88;
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
        changes(numbers);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
    }


    static void change(String[] arr){
       arr[1] = "Prudhvi";
    }
    static  void changes(int[] arr) {
        arr[1] = 55;
    }


}
