package SourceCode.AdvancedDataStructures.DP;//package com.Lokesh.AdvancedDataStructures.DP;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.*;

public class Tiger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String  st = s.next();
        if(isFCapital(st)){
            if(isAllCap(st))
                System.out.println("true");
            else if(isAllSmall(st.substring(1)))
                System.out.println("true");
            else
                System.out.println("False");
        }
        else
            if(isAllSmall(st))
                System.out.println("true");
            else
                System.out.println("false");
    }

    //To find 1st letter is capital or not
    static boolean isFCapital(String st){
        return Character.isUpperCase(st.charAt(0));
    }


    //To find all the ltters are small
    static boolean isAllSmall(String st){
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i) > 'A' && st.charAt(i) < 'Z'){
                return false;
            }
        }
        return true;
    }

    //To find if all the letters are capital or not.
    static boolean isAllCap(String st){
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i) > 'a' && st.charAt(i) < 'z'){
                return false;
            }
        }
        return true;
    }


    // To find if second letter is capital or not.
    static boolean isS(String st){
        return st.charAt(1) >'A' && st.charAt(1) <'Z';
    }
}
