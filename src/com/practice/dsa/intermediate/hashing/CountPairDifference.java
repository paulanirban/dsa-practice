package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
* You are given an array A of N integers and an integer B.
* Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
*
* Since the answer can be very large, return the remainder after dividing the count with 10^9+7.
* */
public class CountPairDifference {
   public static void main(String[] args) {
      int[] arrVals = {1, 2, 1, 2};
      int diff = 1;

      System.out.println(countPair(arrVals, diff));
   }

   private static int countPair(int[] arrVals,  int diff) {
      int count = 0;

      HashMap<Integer, Integer> countMap = new HashMap<>();
      for(int i=0; i<arrVals.length; i++) {
         int countNum = countMap.getOrDefault(arrVals[i], 0);
         countMap.put(arrVals[i], ++countNum);
      }

      for(int i=0; i<arrVals.length; i++) {
         int sum = arrVals[i] + diff;

         if(countMap.containsKey(sum)) {
            count += countMap.get(sum);
         }
      }
      return (int)(count % (1e9+7));
   }
}
