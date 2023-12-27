package com.practice.dsa.intermediate.hashing;

import java.util.HashSet;
import java.util.Set;

/*
* Given an integer array A containing N distinct integers.
* Find the number of unique pairs of integers in the array whose XOR is equal to B.
*
* NOTE:
* Pair (a, b) and (b, a) is considered to be the same and should be counted once.
* */
public class PairWithGivenXOR {
   public static void main(String[] args) {
      int[] arrVal = {3, 6, 8, 10, 15, 50};
      int targetXor = 5;
      System.out.println(countPairsWithGivenXor(arrVal, targetXor));
   }

   private static int countPairsWithGivenXor(int[] arrVal, int targetXor) {
      int count = 0;

      Set<Integer> xorNumSet = new HashSet<>();
      for(int num : arrVal) {
         if(xorNumSet.contains(num ^ targetXor)) {
            count++;
         }
         xorNumSet.add(num);
      }

      return count;
   }
}
