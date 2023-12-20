package com.practice.dsa.intermediate.arrays.carryforward;

/*
* You are given a string S, and you have to find all the amazing substrings of S.
* An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
*
* Input
* ----------
* Only argument given is string S.
*
* Output
* ----------
* Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
*
* Constraints
* ----------
* 1 <= length(S) <= 1e6
* S can have special characters
*
* */
public class AmazingSubstrings {
   public static void main(String[] args) {
      System.out.println(countAmazingSubarrays("ABEC"));
   }

   private static int countAmazingSubarrays(String str) {
      int countSubarrays = 0;
      int strLength = str.length();
      int mod = 10003;

      for(int i=0; i<strLength; i++) {
         char charAtPosition = str.toLowerCase().charAt(i);
         if(charAtPosition == 'a' || charAtPosition == 'e' || charAtPosition == 'i' ||
               charAtPosition == 'o' || charAtPosition == 'u') {
            countSubarrays = (countSubarrays + (strLength - i) % mod) % mod;
         }
      }

      return countSubarrays;
   }
}
