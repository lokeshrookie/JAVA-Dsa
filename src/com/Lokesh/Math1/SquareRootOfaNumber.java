package com.Lokesh.Math1;

public class SquareRootOfaNumber {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(n,p));
    }

    private static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double ans = 0.0;
        while(s<e){
            int m = s+(e-s)/2;
            if(m*m == n){
                ans = m;
                return ans;
            }
            if(m*m > n){
                e = m+1;
            }
            else
                s = m-1;
        }
        double inc = 0.1;
        for (int i = 0; i < p; i++) {

            while( ans * ans <=n){
                ans = ans+inc;
            }
            ans = ans - inc;
            inc = inc/10;
        }
        return ans;
    }
}
