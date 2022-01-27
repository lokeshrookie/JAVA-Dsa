package SourceCode.Strings;

public class UniqueCharacters {

    public static void main(String[] args) {
        String text = "This is awesome";
        String characters = "";
        String duplicates = "";
        for(int i = 0; i<text.length(); i++){
            if(characters.contains(Character.toString(text.charAt(i)))) {
                duplicates = duplicates + text.charAt(i);
            }
            characters = characters + text.charAt(i);
        }
        System.out.println(duplicates);
    }
}
