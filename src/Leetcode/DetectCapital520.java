package Leetcode;

import java.util.Scanner;

public class DetectCapital520 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner s = new Scanner(System.in);
        System.out.println(sol.detectCapitalUse(s.next()));
    }


}

class Solution {
    public boolean detectCapitalUse(String st) {
        if(isFCapital(st)){
            if(isAllCap(st))
                return true;
            else return isAllSmall(st.substring(1));
        }
        else
            return isAllSmall(st);
    }

    //To find 1st letter is capital or not
    static boolean isFCapital(String st){
        return Character.isUpperCase(st.charAt(0));
    }


    //To find all the ltters are small
    static boolean isAllSmall(String st){
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z'){
                return false;
            }
        }
        return true;
    }

    //To find if all the letters are capital or not.
    static boolean isAllCap(String st){
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z'){
                return false;
            }
        }
        return true;
    }


    // To find if second letter is capital or not.
    static boolean isS(String st){
        return st.charAt(1) >='A' && st.charAt(1) <='Z';
    }
}