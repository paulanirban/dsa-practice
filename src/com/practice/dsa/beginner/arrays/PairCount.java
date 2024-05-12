package com.practice.dsa.beginner.arrays;

import java.util.HashMap;
import java.util.Map;

/*
* Problem Description
*
* You are given an integer array A and an integer B.
* You are required to return the count of pairs having sum equal to B.
*
* NOTE: pair (i,j) and (j,i) are same.
* */
public class PairCount {
   public static void main(String[] args) {
      int[] arrVals = {1,2,3,2,1};
      int targetSum = 5;

      Map<Integer, Integer> pairSumMap = new HashMap<>();
      int pairCount = 0;
      for(int num: arrVals) {
         pairSumMap.put(num, pairSumMap.getOrDefault(num, 0)+1);

         int complement = targetSum - num;
         if(pairSumMap.containsKey(complement)) {
            pairCount++;
         }
      }

      System.out.println(pairCount);
   }
}
