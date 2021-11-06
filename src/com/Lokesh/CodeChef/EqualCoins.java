package com.Lokesh.CodeChef;

import java.util.Scanner;

public class EqualCoins {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int T = s.nextInt();
//        int X;
//        int Y;
//        for (int i = 0; i < T; i++) {
//            X = s.nextInt();
//            Y = s.nextInt();
//            X = X*1;
//            Y = Y*2;
//            if(X%2 == 1)
//                System.out.println("NO");
//            else if(X%2 ==  0 && Y%2 == 0)
//                System.out.println("YES");
//            else if(X>1)
//                System.out.println("YES");
//            else
//                System.out.println("NO");
//        }
//    }
public static void main (String[] args) throws java.lang.Exception
{
    Scanner s = new Scanner(System.in);
    int T = s.nextInt();
    while(T > 0){
        int x = s.nextInt();
        int y = s.nextInt();
        if(x%2 == 1){
            System.out.println("NO");
        }
        else if(x%2 == 0 && y%2 == 0){
            System.out.println("YES");
        }

        else if(x>1 ){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
        T--;

    }

    // for (int i = 0; i < T; i++) {
    //     X = s.nextInt();
    //     Y = s.nextInt();
    //     X = X*1;
    //     Y = Y*2;
    //     if(X%2 == 1)
    //         System.out.println("NO");
    //     else if(X%2 ==  0 && Y%2 == 0)
    //         System.out.println("YES");
    //     else if(X>1)
    //         System.out.println("YES");
    //     else
    //         System.out.println("NO");
    // }
}
}
