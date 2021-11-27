package com.Lokesh.Strings;

public class Substring {
    public static void main(String[] args) {
        String s = "Lokesh";

//        System.out.println(s.substring(0));
        sub(s);
    }


    static void sub(String  s){


       int n = s.length();
            // this is for the selection
            // of starting point
            for (int i = 0; i < n; i++) {

                // 2nd for loop is for selection
                // of ending point
                for (int j = i; j < n; j++) {

                    // 3rd loop is for printing from
                    // starting point to ending point
                    for (int k = i; k <=j; k++) {
                        System.out.print(s.charAt(k));
                    }
                    // changing the line after printing
                    // from starting point to ending point
                    System.out.println();
                }
            }
        }

        // Driver Code




}
