package TESTER;

import com.Lokesh.Strings.SBuildler;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args){


        String str = "Hello";
        System.out.println(duplicates(str));
        System.exit(0);

//       System.out.println(replace0With1(1001));
        System.out.println((int) (Math.random() * 101));
        replace0With1(10010);
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

        System.out.println("No of Digits : " + countDigits(12345678));


    }

    static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n/=10;
        }
        return count;
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


    static int  replace0with1(int n){
            String  s =  String.valueOf(n);
            s = s.replaceAll("0","1");
            return Integer.parseInt(s);
    }

    static  void replace0With1(int n){
        char[] ch = String.valueOf(n).toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(ch[i] == '0'){
                ch[i] ='1';
            }
        }
        System.out.println(String.valueOf(ch));
        System.out.println(Arrays.toString(ch));
    }

    static void st(int n){
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.peek();
        st.pop();
        System.out.println(st);
//        st.toArray();
        System.out.println(st.search(5));

    }

    /////////
    public static String duplicates(String S){

        StringBuilder builder = new StringBuilder();

        int count = 0;

        for (int i = 0; i < S.length(); i++) {

            while(i < S.length() - 1 && S.charAt(i) == S.charAt(i+1)){

                count = 0;
                count++;
                i++;
            }

            builder.append(S.charAt(i));
        }
        return builder.toString();
    }
}




