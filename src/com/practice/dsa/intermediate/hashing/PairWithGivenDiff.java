package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
* Given a one-dimensional unsorted array A containing N integers.
* You are also given an integer B, find if there exists a pair of elements in
* the array whose difference is B.
*
* Return 1 if any such pair exists else return 0.
* */
public class PairWithGivenDiff {
   public static void main(String[] args) {
      int[] arrVal = {200, 20, 80};
      int diff = 0;

      System.out.println(pairExists(arrVal, diff));
   }

   private static int pairExists(int[] arrVal, int diff) {
      HashMap<Integer, Integer> numMap = new HashMap<>();

      for(int i=0; i<arrVal.length; i++) {
         int count = numMap.getOrDefault(arrVal[i], 0);
         numMap.put(arrVal[i], ++count);
      }

      if(diff == 0) {
         for(int val : numMap.values()) {
            if(val == 2) {
               return 1;
            }
         }
      }

      if(diff == 0) {
         return 0;
      }

      for(int i=0; i<arrVal.length; i++) {
         int sum = arrVal[i] + diff;
         if(numMap.containsKey(sum)) {
            return 1;
         }
      }

      return 0;
   }
}
