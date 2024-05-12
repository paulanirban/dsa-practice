package com.practice.dsa.intermediate.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Problem statement
*
* Given an array “A” of N integers and you have also defined the new array “B” as
* a concatenation of array “A” for an infinite number of times.
*
* For example, if the given array “A” is [1,2,3] then, infinite array “B” is [1,2,3,1,2,3,1,2,3,.......].
* Now you are given Q queries, each query consists of two integers “L“ and “R”(1-based indexing).
* Your task is to find the sum of the subarray from index “L” to “R” (both inclusive) in the infinite array “B” for each query.
*
* Note :
* The value of the sum can be very large, return the answer as modulus 10^9+7.
*
* */
public class SumOfInfiniteArrays {
   public static void main(String[] args) {
      int[] arr = {10};
      List<List<Long>> queries = new ArrayList<>();
      queries.add(Arrays.asList(1l, 1l));
      queries.add(Arrays.asList(7l, 7l));
      queries.add(Arrays.asList(3l, 5l));
      queries.add(Arrays.asList(1l, 2l));
      List<Integer> lst = getSums(arr, arr.length, queries, queries.size());
   }

   private static List<Integer> getSums(int[] arr, int n, List<List<Long>> queries, int q) {
      Long right = Long.MIN_VALUE;

      for(List<Long> query : queries) {
         right = Math.max(right, query.get(1));
      }

      int[] prefixSum = new int[Math.toIntExact(right)];
      prefixSum[0] = arr[0];

      for(int i=1; i<prefixSum.length; i++) {
         prefixSum[i] = (int) ((prefixSum[i-1] + arr[i % n]) % (10e9 + 7));
      }

      List<Integer> result = new ArrayList<>();
      for(List<Long> query : queries) {
         int end = Math.toIntExact(query.get(1)) - 1;

         if(query.get(0) == 1) {
            result.add(prefixSum[end]);
         } else {
            int start = Math.toIntExact(query.get(0)) - 1;

            //if(start != end) {
            result.add(prefixSum[end] - prefixSum[start-1]);
            // } else if(start == end) {
            //     result.add(prefixSum[end] - prefixSum[end-1]);
            // }
         }
      }

      return result;
   }
}
