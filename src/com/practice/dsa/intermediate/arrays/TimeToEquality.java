package com.practice.dsa.intermediate.arrays;


import java.util.Arrays;

/*
* Problem Description
*
* Given an integer array A of size N.
* In one second, you can increase the value of one element by 1.
* Find the minimum time in seconds to make all elements of the array equal.
*
* Example Input
* A = [2, 4, 1, 3, 2]
* Example Output
* 8
* */
public class TimeToEquality {
   public static void main(String[] args) {
      int[] arr = {731,349,490,781,271,405,811,181,102,126,866,16,622,492,194,735};
      Arrays.sort(arr);
      int maxElemntVal =  arr[arr.length-1];

      int minTime = 0;

      for(int num : arr) {
         minTime += maxElemntVal - num;
      }

      System.out.println(minTime);
   }
}
