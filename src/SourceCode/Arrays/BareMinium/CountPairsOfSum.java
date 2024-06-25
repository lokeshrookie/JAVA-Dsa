package SourceCode.Arrays.BareMinium;
import java.util.Arrays;
class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1};
        int sum1 = 2;
        int[] arr2 = {1, 5, 7, 1};
        int sum2 = 8;
        System.out.println(countPairs(arr2, sum2));
//        System.out.println(countPairs(arr1,sum1));
        System.out.println(count(arr2,sum2));
    }
    private static int countPairs(int[] arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] +  " at " + i + " " +  arr[j] + " at " + j);
                    count++;
                }
            }
        }
        return count;
    }


    static int count(int[] arr , int sum){
        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }

        }
        return count;
    }
}