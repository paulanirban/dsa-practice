package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
* You are given an array A of N integers and an integer B. Count the number of pairs (i,j)
* such that A[i] + A[j] = B and i ≠ j.
* Since the answer can be very large, return the remainder after dividing the count with 10^9+7.
*
* Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
* */
public class CountPairSum {
   public static void main(String[] args) {
      int[] arrVal = {3, 5, 1, 2};
      int sum = 8;
      System.out.println(countPairs(arrVal, sum));
   }

   private static int countPairs(int[] arrVal, int sum) {
      int count = 0;

      HashMap<Integer, Integer> countMap = new HashMap<>();
      for(int i=0; i<arrVal.length; i++) {
         int diff = sum - arrVal[i];

         if(countMap.containsKey(diff)){
            count += countMap.get(diff);
         }

         if(countMap.containsKey(arrVal[i])) {
            countMap.put(arrVal[i], countMap.get(arrVal[i]) + 1);
         } else {
            countMap.put(arrVal[i], 1);
         }
      }
      return (int)(count % (1e9+7));
   }
}
