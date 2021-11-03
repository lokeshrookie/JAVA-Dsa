package com.Lokesh.Math1;

public class NewtonSruareRootMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static  double sqrt(double n){
        double x = n; // x is square root assumed.
        double root; // actual square root.
        while (true){
//          root = 0.5 * (x + (n/x)); // formula
            root = (x + (n/x))/2; // same formula.
            if(Math.abs(root - x) < 1){ // error = |root - x|.(absolute value)
                break;
            }
            x = root;
        }
        return  root;
    }
}

/* Time   Complexity:
    O((logN F(N))

 */

