package com.Lokesh.BasicInterviewQuestions;

public class Fibo {
    public static void main(String[] args) {
        // to print the n nubmer of fibonacci numbers, we have to use for loop
        int n = 10; // n = number of numbers to print.
        for(int i = 0; i<n; i++){
            System.out.println(nThFibo(i));
        }
    }
    static int nThFibo(int n)
    {
        // Function to find the nth Fibonacci number
        if (n <= 1) {
            return n;
        }
        int previousFib = 0, currentFib = 1;
        //n-1 because, 1st and 3nd will be given by the above if statement.
        // The below loop will executed only when n > 1
        for (int i = 0; i < n - 1; i++)
        {
            int newFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = newFib;
        }
        return currentFib;
    }
}
