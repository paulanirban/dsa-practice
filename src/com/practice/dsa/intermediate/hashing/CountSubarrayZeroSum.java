package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
* Given an array A of N integers. Find the count of the subarrays in the array which sums to zero.
* Since the answer can be very large, return the remainder on dividing the result with 10^9+7
* */
public class CountSubarrayZeroSum {
   public static void main(String[] args) {
      int[] arrVal = {1, -1, -2, 2};
      System.out.println(getSubarrayZeroSumCount(arrVal));
   }

   private static int getSubarrayZeroSumCount(int[] arrVal) {
      int totalCount = 0;

      long sum = 0;
      HashMap<Long, Integer> countMap = new HashMap<>();
      countMap.put(0L, 1);

      for(int i=0; i<arrVal.length; i++) {
         sum += arrVal[i];

         if(countMap.containsKey(sum)) {
            int count = countMap.get(sum);
            totalCount += count;
            countMap.put(sum, ++count);
         } else {
            countMap.put(sum, 1);
         }
      }

      return totalCount;
   }
}
