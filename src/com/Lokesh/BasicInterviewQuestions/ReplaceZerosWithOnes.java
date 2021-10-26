package com.Lokesh.BasicInterviewQuestions;

public class ReplaceZerosWithOnes {
    public static void main(String[] args) {
        int num = 20304030;
        System.out.println(num);
        replace(num);
    }
    private static void replace(int num) {
        String s = Integer.toString(num);
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '0'){
                ch[i] = '1';
            }
        }
        int ans = Integer.parseInt(new String(ch));
        System.out.println(ans);

    }
}
