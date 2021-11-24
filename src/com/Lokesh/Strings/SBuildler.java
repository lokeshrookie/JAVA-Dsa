package com.Lokesh.Strings;

public class SBuildler {
    public static void main(String[] args) {
        String s = new String();
        for(char i  = 'a'; i<'z'; i++){
            s = s + i;
        }
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);
        }
        System.out.println(sb);

        StringBuffer sbuff = new StringBuffer();
        for (char c = 'A'; c <= 'z'; c++) {
            sbuff.append(c);
        }
        System.out.println(sbuff.toString());




    }
}
