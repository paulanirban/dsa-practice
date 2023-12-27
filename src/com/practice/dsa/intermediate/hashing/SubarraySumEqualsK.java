package com.practice.dsa.intermediate.hashing;

/*
* Given an array of integers A and an integer B.
* Find the total number of subarrays having sum equals to B.
* */

import java.util.HashMap;

public class SubarraySumEqualsK {
   public static void main(String[] args) {
      int[] arrVals = {13, 9, 19, -9, -19, 14, -15};
      int targetSum = 15;
      System.out.println(countSubarraysEqualsToTarget(arrVals, targetSum));
   }

   private static int countSubarraysEqualsToTarget(int[] arrVals, int targetSum) {
      int count = 0;
      HashMap<Integer, Integer> summationMap = new HashMap<>();
      summationMap.put(0, 1);

      int sum = 0;
      for(int i=0; i<arrVals.length; i++) {
         sum += arrVals[i];

         if(summationMap.containsKey(sum - targetSum)) {
            count += summationMap.get(sum - targetSum);
         }

         summationMap.put(sum, summationMap.getOrDefault(sum, 0) + 1);
      }

      return count;
   }
}
