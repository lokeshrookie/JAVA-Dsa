package SourceCode.BasicPrograms;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(hcf(a,b));

//        hcf(a,b);
    }
    private static int hcf(int a, int b) {
        // if any num is zero, return another number.
        if(a == 0 || b == 0){
            return Math.max(a,b);
        }
        int hcf = Math.min(a,b);
        while (true){
            if(a%hcf == 0 && b%hcf == 0){
//                System.out.println("hcf ==  " + hcf);
                return hcf;
            }
            hcf--;
        }
    }
}

