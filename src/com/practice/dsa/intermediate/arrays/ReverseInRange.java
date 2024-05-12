package com.practice.dsa.intermediate.arrays;

/*
* Problem Description
*
* Given an array A of N integers and also given two integers B and C.
* Reverse the elements of the array A within the given inclusive range [B, C].
*
* */
public class ReverseInRange {
   public static void main(String[] args) {
      int[] arr = {2, 5, 6};
      int start = 0;
      int end = 2;

      while(start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;

         start++;
         end--;
      }

      for(int num: arr) {
         System.out.print(num + " ");
      }
   }
}
