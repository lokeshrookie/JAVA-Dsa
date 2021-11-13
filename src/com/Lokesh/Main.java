//package com.Lokesh;
//
//public class Main {
//    public static void main(String[] args) {
////        isPalindrome("MalayalaM");
//        System.out.println(isPalindrome("lol"));
//    }
//
//
//    private static boolean isPalindrome(String str) {
//        String Original = str.toLowerCase();
//        String Rev = "";
//
//        return Original == Rev;
//    }
//
////    static boolean isPalindrome(int n ){
////        int org = n;
////        int rev = 1;
////        while(org>0){
////            int rem = org%10;
////            org = org/10;
////            rev = rev * 10 + rem;
////        }
////        return org == rev;
////    }
//
//    static boolean isPalindrome(String str) {
//        if (str == null || str.length() == 0) {
//            return true;
//        }
//        str = str.toLowerCase();
//        for (int i = 0; i <= str.length() / 2; i++) {
//            char start = str.charAt(i);
//            char end = str.charAt(str.length() - 1 - i);
//
//            if (start != end) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
//
