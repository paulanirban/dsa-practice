package com.practice.dsa.intermediate.carryforward;

/*
* Problem Description
*
* Given an array A, find the size of the smallest subarray
* such that it contains at least one occurrence of the maximum
* value of the array and at least one occurrence of the minimum
* value of the array.
*
* Input 1:
* A = [1, 3, 2]
*
*
* Input 2:
* A = [2, 6, 1, 6, 9]
*
* Output 1:
* 2
*
* Output 2:
* 3
*
* */
public class ClosestMatrix {
   public static void main(String[] args) {
      int[] arr = {2, 6, 1, 6, 9};
      int minValue = Integer.MAX_VALUE;
      int maxValue = Integer.MIN_VALUE;

      for(int num: arr) {
         minValue = Math.min(num, minValue);
         maxValue = Math.max(num, maxValue);
      }

      int minIndex = -1;
      int maxIndex = -1;
      int smallestSubarrayCount = Integer.MAX_VALUE;
      for(int i=0; i<arr.length; i++) {
         if(arr[i] == minValue) {
            minIndex = i;
         } else if(arr[i] == maxValue) {
            maxIndex = i;
         }

         if(minIndex != -1 && maxIndex != -1) {
            smallestSubarrayCount = Math.min(smallestSubarrayCount,
                  Math.abs(minIndex - maxIndex) + 1);
         }
      }

      System.out.println(smallestSubarrayCount == Integer.MAX_VALUE ? 1 : smallestSubarrayCount);
   }
}
