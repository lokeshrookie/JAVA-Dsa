package SourceCode.Arrays.BareMinium;
import java.util.Arrays;
class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1};
        int sum1 = 2;
        int[] arr2 = {1, 5, 7, 1};
        int sum2 = 6;
        System.out.println(countPairs(arr2, sum2));
//        System.out.println(countPairs(arr1,sum1));
        System.out.println(count(arr2,sum2));
    }
    private static int countPairs(int[] arr, int sum) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }


    static int count(int[] arr , int sum){
        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] + arr[j-1] == sum){
                    count++;
                }
            }

        }
        return count;
    }
}