package com.Lokesh.Strings;

/**
 *
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String name = "Hello Lokesh";
        String characters = "";
        String uniques = "";
        String duplicates = "";

        for(int i = 0; i<name.length(); i++){
            if(characters.contains(Character.toString(name.charAt(i)))){
                duplicates = duplicates+name.charAt(i);
            }
            else{
                uniques = uniques+name.charAt(i);
            }
            characters = characters + name.charAt(i);
        }
        System.out.println(characters + "  -- all the characters");
        System.out.println(uniques + " --> all the unique characters");
        System.out.println(duplicates + " --> all the duplicate elements");
    }
}
