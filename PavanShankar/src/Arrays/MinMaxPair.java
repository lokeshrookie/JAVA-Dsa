package Arrays;

public class MinMaxPair {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        minMaxPair(arr);

    }
    public static void minMaxPair(int[] arr){
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length;i++){
            if (arr[min] > arr[i]) {
                min = i;
            }
            if (arr[max] < arr[i])   {
                max = i;
            }
        }
        System.out.println(arr[min]);
        System.out.println(arr[max]);
    }
}
