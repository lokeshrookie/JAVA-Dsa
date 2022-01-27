package SourceCode.Strings;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "hello lokesh  This is loki 1234567890" ;
        int countalpha = 0;
        int countNums = 0;
        int countVowels = 0; // to count vowels. convert string to lower to upper case.
        String  lower = s.toLowerCase();
        for(int i = 0; i<s.length(); i++){
            // the if statement counts no of alphabets in the string.
            if(s.charAt(i)>= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >='a' && s.charAt(i) <= 'z'){
                countalpha++;
            }
            if(s.charAt(i) >='0' && s.charAt(i) <='9'){
                countNums++;
            }
            if(lower.charAt(i) == 'a' || s.charAt(i) == 'e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                countVowels++;
            }
        }
        System.out.println("Total alphabets are : " + countalpha);
        System.out.println("No of digits is " + countNums);
        System.out.println("No of vowels : " + countVowels);
    }
}
