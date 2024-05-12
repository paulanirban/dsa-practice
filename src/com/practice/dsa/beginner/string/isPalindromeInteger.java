package com.practice.dsa.beginner.string;

public class isPalindromeInteger {
   public static void main(String[] args) {
      int num = 1001;
      System.out.println(checkPalindrome(num));
   }

   private static boolean checkPalindrome(int num) {
      if(num < 0 || num % 10 == 0) {
         return false;
      } else if(num == 0) {
         return true;
      }

      int reversedNumber = 0;
      int temp = num;

      while(num != 0) {
         int remainder = num % 10;
         reversedNumber += remainder;

         num /= 10;

         if(num != 0) {
            reversedNumber *= 10;
         }
      }

      if(reversedNumber == temp) {
         return true;
      }

      return false;
   }
}
