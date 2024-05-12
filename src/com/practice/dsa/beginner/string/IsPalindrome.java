package com.practice.dsa.beginner.string;

/*
* Problem Description:
*
* Write a program to check whether the given string is a palindrome or not.
* Return True if it is palindrome else return False.
*
* */
public class IsPalindrome {
   public static void main(String[] args) {
      System.out.println(isPalindrome("abcde"));
   }

   private static boolean isPalindrome(String str) {
      if(str.length() % 2 == 0) {
         return false;
      }

      int start = 0;
      int end = str.length()-1;

      while(start < end) {
         if(str.charAt(start) != str.charAt(end)) {
            return false;
         }
         start++;
         end--;
      }

      return true;
   }
}
