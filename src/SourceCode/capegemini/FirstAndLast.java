package SourceCode.capegemini;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i<t; i++){
            int x  = s.nextInt();
            int y = s.nextInt();
            System.out.println((x/(y*3)));
        }

    }//        int n = s.nextInt();
//        for(int i = 0; i<n; i++){
//            int f = s.nextInt();
//            int se = s.nextInt();
//            if(se >= f  && se <= f+200){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//        }
//    }

}
