package TESTER;

import java.util.ArrayList;
import java.util.Arrays;

public class Amazon1 {
    public static void main(String[] args) {
        int TSpace = 90, Pkgs = 5, PkgSpace[] = {1,34,25,10,60};
        System.out.println(method(TSpace, Pkgs, PkgSpace));
    }






    static String method(int TS, int Pkgs, int[] pksspce){
        int[] ans = new int[2];
        for(int i = 0; i<pksspce.length-1; i++){
            for (int j = 0; j < pksspce.length; j++) {
                if(pksspce[i] + pksspce[j] == 60){
                    ans[0] = i;
                    ans[1] = j;
                    return Arrays.toString(ans);
                }
            }

        }
        ans[0] = -1;
        ans[1] = -1;
        return Arrays.toString(ans);
    }







}
