package MindTreePractise;

import java.util.*;

public class GaneshWipro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int[] a = new int[si];
        for(int i = 0; i<a.length; i++){

            a[i] = s.nextInt();
        }
        System.out.println(ans(a));
    }
    public static int ans(int[] a){
        int r = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] >=0 ){
                r+= a[i];
            }
        }
        return r;
    }
}
