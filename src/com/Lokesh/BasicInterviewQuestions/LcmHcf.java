package com.Lokesh.BasicInterviewQuestions;

public class LcmHcf
{
    public static void main(String args[])
    {
        int a = 12, b = 9, gcd = 1;
//finds GCD
        for(int i = 1; i <= a && i <= b; ++i)
        {
//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i
//Checks that i is present in both or not
//returns true if both conditions are true
            if(a % i == 0 && b % i == 0)
//assigns i into gcd
                gcd = i;
        }
//determines lcm of the given number
        int lcm = (a * b) / gcd;
//prints the result
        System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
    }
}