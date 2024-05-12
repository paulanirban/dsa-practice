package com.practice.dsa.intermediate.carryforward;

/*
* Problem Description
*
* You have given a string A having Uppercase English letters.
* You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
*
* */
public class SpecialSubsequence {
   public static void main(String[] args) {
      String str = "GAB";
      int[] sequenceCounter = new int[str.length()];

      int count = 0;
      int i = str.length()-1;
      for(; i >= 0; i--) {
         if(str.charAt(i) == 'G') {
            count++;
         }
         sequenceCounter[i] = count;
      }

      int pairCount = 0;
      for(i=0; i<str.length(); i++) {
         if(str.charAt(i) == 'A') {
            pairCount +=sequenceCounter[i];
         }
      }

      System.out.println(pairCount);
   }
}
