package com.practice.dsa.intermediate.arrays;

/*
* Problem Description
*
* You are given an integer array A of length N.
* You have to find the sum of all subarray sums of A.
* More formally, a subarray is defined as a contiguous part
* of an array which we can obtain by deleting zero or more
* elements from either end of the array. A subarray sum denotes
* the sum of all the elements of that subarray.
*
* Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
*
* */
public class SumOfAllsubArrays {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3};
      long sum = 0;

      for(int i=0; i<arr.length; i++) {
         sum += arr[i] * (i+1) * (arr.length - i);
      }

      System.out.println(sum);
   }
}
