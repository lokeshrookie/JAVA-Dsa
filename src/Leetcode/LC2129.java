package Leetcode;

import java.util.Scanner;

/**
 * Capitalize the title
 */
public class LC2129 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        capTitle(st);
        System.out.println(capTitle(st));
    }
    //method
    static String capTitle(String st){
        st.split(" ");
        return st;
    }

}
