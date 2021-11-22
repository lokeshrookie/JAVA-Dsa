package TESTER;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String s1 = "lol";
        String s2 = "lo";
        System.out.println(isPalindrome(s1));
    }

    static boolean isPalindrome(String str)
    {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
        // While there are characters to compare
        while (i < j) {
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        // Given string is a palindrome
        return true;
    }
}
