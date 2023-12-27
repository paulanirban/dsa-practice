package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;
import java.util.List;

/*
* Given an array of positive integers A and an integer B, find and return first continuous
* subarray which adds to B.
* If the answer does not exist return an array with a single integer "-1".
*
* First sub-array means the sub-array for which starting index in minimum.
* */
public class SubarrayWithGivenSum {

   public static void main(String[] args) {
      int[] arrVal = {1, 2, 3, 4, 5};
      int targetSum = 5;

      String separator = "";
      System.out.print("[");
      for(int val : getSubArray(arrVal, targetSum)) {
         System.out.print(separator + val);
         separator = ", ";
      }
      System.out.print("]");
   }

   private static int[] getSubArray(int[] arrVal, int targetSum) {
      HashMap<Long, Integer> summationMap = new HashMap<>();
      summationMap.put(0L, -1);

      long sum = 0;
      int start = -1, end = -1;
      for(int i=0; i<arrVal.length; i++) {
         sum += arrVal[i];

         if(summationMap.containsKey(sum - targetSum)) {
            start = summationMap.get(sum - targetSum) + 1;
            end = i;
            break;
         }

         summationMap.put(sum, i);
      }

      if(start == -1 || end == -1) {
         return new int[]{-1};
      } else {
         int[] arr = new int[(end - start)+1];
         for(int i=start, j=0; i<=end; i++, j++) {
            arr[j] = arrVal[i];
         }
         return arr;
      }
   }
}
