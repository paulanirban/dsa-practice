package com.practice.dsa.intermediate.arrays;

/*
* Problem Description
*
* You are given a constant array A.
* You are required to return another array which is the reversed form of the input array.
* */
public class ArrayReverse {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 2, 1};
      int arrLength = arr.length;
      int[] revArr = new int[arrLength];

      int count = arrLength;
      for(int num : arr) {
         revArr[--count] = num;
      }

      for(int num : revArr) {
         System.out.print(num + " ");
      }
   }
}
