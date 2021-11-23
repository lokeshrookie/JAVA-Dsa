package TESTER;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int arr[][] = new int[row][column];
        int arr2[][] = new int[row][column];
        for(row = 0; row< arr.length; row++){
            for(column = 0; column< arr[row].length; column++){
                arr[row][column] = s.nextInt();
            }
        }
        for(row = 0; row< arr.length; row++){
            for(column = 0; column< arr[row].length; column++){
                arr2[row][column] = s.nextInt();
            }
        }


        for(row = 0; row< arr.length; row++){
            for(column = 0; column< arr[row].length; column++){
                arr[row][column] = arr[row][column] * arr2[row][column];
            }
        }

        System.out.println(" the additon is : ");
        for(row = 0; row< arr.length; row++){
            for(column = 0; column< arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }


    }

//
    static  void twoSort(int[][] arr, int row, int column){
        for(row = 0; row < arr.length; row++)
            for (column = 0; column < arr[row].length; column++)
                for (int i = 0; i<arr.length; i++){
                    for(int j = 0; j<arr.length-i; j++){
                        if(arr[row][column] < arr[i][j]){
                            int temp = arr[row][column];
                            arr[row][column] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
    }

    static  void swap(int[][] arr, int first, int second){
        int temp = first;
        first = second;
        second = temp;

    }

    static boolean isPalindrome(String str)
    {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
        // While there are characters to compare
        while (i < j) {
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        // Given string is a palindrome
        return true;
    }


    static boolean isArmstrong2(int n)
    {
        int temp, digits=0, last=0, sum=0;
//assigning n into a temp variable
        temp=n;
//loop execute until the condition becomes false
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
//determines the last digit from the number
            last = temp % 10;
//calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digits));
//removes the last digit
            temp = temp/10;
        }
//compares the sum with n
        if(n==sum)
//returns if sum and n are equal
            return true;
//returns false if sum and n are not equal
        else return false;
    }






    static boolean isArmstrong(int n){
        int original = n;
        int ans = 0;
        while(n > 0 ){
            int rem = n%10;
            ans = ans +  rem * rem * rem;
            n = n/10;
        }
        return original == ans;
    }



    static int countNums(int n){
            int count = 0;
            while(n > 0){
                count++;
                n = n/10;
            }
            return count;
    }


    static boolean isPalidrome(int n){
        int original  = n;
        int ans = 0;

        while (n > 0){
            int rem = n%10;
            n = n/10;
            ans = ans * 10 + rem;
        }
        return  original == ans;
    }



}


