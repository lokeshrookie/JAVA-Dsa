package com.Lokesh.CodeChef;

import java.util.Scanner;

public class MAKEPAL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T>0){
            int odd_count = 0;
            int n = s.nextInt();
            for(int i = 0; i<n; i++){
                int temp = s.nextInt();
                if(temp%2 != 0 )
                    odd_count++;
            }
            if(odd_count%2 != 0){
                odd_count--;
            }
            System.out.println(odd_count/2);
            T--;
        }
    }
}
