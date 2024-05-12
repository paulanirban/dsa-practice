package com.practice.dsa.intermediate.misc;

/*
*
* Given a positive integer, print all the prime numbers possible
* Input: 9
* Output: 2, 3, 5, 7
* */
public class PrintPrimes {
   public static void main(String[] args) {
      int num = 9;
      for(int i=1; i<=9; i++) {
         System.out.print(isPrime(i) ? i+" " : "");
      }
   }

   private static boolean isPrime(int num) {
      if(num == 1) {
         return false;
      } else if(num == 2 || num == 3) {
         return true;
      } else if(num % 2 == 0 || num % 3 == 0) {
         return false;
      }

      for(int i=5; i*i<=num; i+=6) {
         if(num % i == 0 || num % (i+2) == 0) {
            return false;
         }
      }

      return true;
   }
}
