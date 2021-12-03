package com.Lokesh.Recursion.Subsets;

/**
 * 1. pass processed and unprocessed strings to the method
 * 2. if up is empty, return processed String. this means we checked every character.
 *  unchecked characters will be in the unprocessed string
 *  3. take first char ch = charAt(0). if this char is what we wanted to skip,
 *      then pass the remaining substring(substring(1)). and leave the character.
 *      ==> If not matched with char, then pass this char as processed string and
 *          pass the substring(1) as unprocessed string.
 *  4. In this way we are removing the selected character in every function/method call.
 *
 */
public class Main {
    public static void main(String[] args) {


        skipchar("", "abbcca" );
//        System.out.println(skipchar(s,c));
    }
    //skip a character
    static void skipchar(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skipchar(p, up.substring(1));
        }
        else{
            skipchar(p + ch, up.substring(1));
        }
    }
}
