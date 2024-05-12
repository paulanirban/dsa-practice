package com.practice.dsa.intermediate.arrays;

/*
* Problem Description
* You are given an integer array C of size A.
* Now you need to find a subarray (contiguous elements)
* so that the sum of contiguous elements is maximum.
* But the sum must not exceed B.
*
* */
public class LargestSubarraySum {
   public static void main(String[] args) {
      int[] arr = {2, 1, 3, 4, 5};
      int[] dp = new int[arr.length];
      int target = 12;

      dp[0] = arr[0];
      int ans = dp[0];

      for(int i=1; i<arr.length; i++) {
         dp[i] = Math.max(arr[i], arr[i] + dp[i-1]);
         ans = Math.max(ans, dp[i]);
      }

      System.out.println(ans);
   }
}
