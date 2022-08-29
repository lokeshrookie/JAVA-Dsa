package SourceCode.Wipro;

import java.util.Scanner;

public class Vandhana {

    // i = tour => *t*r
    // aBAcAba => *b*c*b
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String  i = s.next();
        i = i.toLowerCase();
        System.out.println(i);
        String ans = "";
        for(int j = 0; j<i.length(); j++){
            if(isVow(i, i.charAt(j))){
                continue;
            }

            ans = ans + (i.charAt(j));
        }

        for(int k = 1; k<i.length(); k++){
            if(isVow(ans ,ans.charAt(k))){

            }
        }
    }
    static  boolean isVow( String i, char ch){
        for(int j = 0; j<i.length(); j++){
            if( i.charAt(j) == 'a' ||    i.charAt(j) == 'e' ||  i.charAt(j) == 'i' ||  i.charAt(j) == 'o' ||  i.charAt(j) == 'u' || i.charAt(j) == 'y'){
                return true;
            }
        }
        return false;
    }


}
