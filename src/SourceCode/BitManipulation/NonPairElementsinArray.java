package SourceCode.BitManipulation;

public class NonPairElementsinArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,3,2,1};
        System.out.println(isUnique(arr));

    }

    private static int isUnique(int[] arr) {
        int unique = 0;
        for(int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }
}
