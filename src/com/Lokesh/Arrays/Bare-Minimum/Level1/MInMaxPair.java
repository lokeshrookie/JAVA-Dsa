// import org.graalvm.compiler.lir.ssa.SSAUtil.PhiValueVisitor;
// import java.util.Scanner;
public class MInMaxPair 
{

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int size  = arr.length;
        System.out.println(getMinMax(arr, size));

    }
    static int[] getMinMax(int[] arr, long n)  
    {
        //Write your code here
         long min = arr[0], max = arr[0];
    // loop for finding min 
    for(int i = 0; i<n; i++){
        if(arr[i] < min){
            min = arr[i];
        }
        else{
            continue;
        }
    }
    //loop for finding max
    for(int i = 0; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        else{
            continue;
        }
    }
    // String output = 
    return new int[]{(int) min,(int) max};
    }
}



