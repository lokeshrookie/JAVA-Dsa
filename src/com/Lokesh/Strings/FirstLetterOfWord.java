package com.Lokesh.Strings;

import java.util.Scanner;
/* -------Algorithm-------------
    1.Take an input String.
    2.convert the String to character array. using toCharArray() method.
    3.Iterate through the char array.
    4.while iterating, check that the character is space or not. if not space, then
         print the charArray[i].
         if i == 0, Then Print the element. here, we are printing first letter of the first word.
         if(charArray[i-1]) == ' ', then print the element. This means that, the element at the previous
         index is space. As we know, after a space, new word will begin. so we will print the first letter of
         every new word in this way.
 */
public class FirstLetterOfWord {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        String str = "Hello, My Name Is Lokesh";

        char[] charArr = str.toCharArray();
        for(int i = 0; i<charArr.length; i++){
//
            if(charArr[i] != ' '){
                if(i == 0){
                    System.out.println(charArr[i]);
                }
                else if((charArr[i-1]) == ' '){
                    System.out.println(charArr[i]);
                }

            }
        }
    }
}
