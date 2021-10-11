package com.Lokesh.BasicInterviewQuestions;

import java.util.*;
public class StrongNumber
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
        s.close();
	    System.out.println(isStrong(num));
	}
	static Boolean isStrong(int n){
	    int original = n;
	    int ans = 0;
	    while(n>0){
	        int rem = n%10;
	        ans = ans + fact(rem);
	        n = n/10;
	    }
	    return (original == ans);
	}
	
	static int fact(int a){
	    if(a == 0 ){
	        return 1;
	    }
	    else{
	        return  (a * fact(a-1));
	    }
	}
}
