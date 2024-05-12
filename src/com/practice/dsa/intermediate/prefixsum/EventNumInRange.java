package com.practice.dsa.intermediate.prefixsum;

/*
* Problem Description
*
* You are given an array A of length N and Q queries
* given by the 2D array B of size Q×2. Each query consists of
* two integers B[i][0] and B[i][1].
* For every query, your task is to find the count of even
* numbers in the range from A[B[i][0]] to A[B[i][1]].
*
* Input 1:
* A = [1, 2, 3, 4, 5]
* B = [[0, 2], [2, 4], [1, 4]]
*
* Output 1:
* [1, 1, 2]
*
* */
public class EventNumInRange {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int[][] rangeArr = {{0, 2}, {2, 4}, {1, 4}};

      int[] prefArr = new int[arr.length];
      prefArr[0] = arr[0] % 2 == 0 ? 1 : 0;

      for(int i=1; i<arr.length; i++) {
         prefArr[i] = prefArr[i-1] + (arr[i] % 2 == 0 ? 1 : 0);
      }

      for(int[] range: rangeArr) {
         int start = range[0] == 0 ? 0 : prefArr[range[0] - 1];
         System.out.println(prefArr[range[1]] - start);
      }

   }
}
