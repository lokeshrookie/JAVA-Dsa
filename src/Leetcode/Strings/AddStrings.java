package Leetcode.Strings;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        // 1. add digit by one digit 2. check whether there is a carry to the end 3. check carry out of loop so we may need to append one more digit to stringbuilder
        // Time Complexity O(max(m, n))
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int cur = carry;
            cur += i >= 0 ? num1.charAt(i) - '0' : 0;
            cur += j >= 0 ? num2.charAt(j) - '0' : 0;
            sb.insert(0, cur % 10);
            carry = cur / 10;
        }
        if (carry == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(addStrings("11" , "100"));
    }
}
