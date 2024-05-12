package com.practice.dsa.beginner.arrays;

/*
* Problem Description
*
* Given an array A, check if it is sorted in non-decreasing order or not.
*
* Non-decreasing order means that the numbers in a sequence can stay the same
* or increase, but they cannot decrease.
* */
public class CheckArrayIfSorted {
   public static void main(String[] args) {
      int[] arrVal = {1, 2, 1};

      System.out.println(checkIfSorted(arrVal));
   }

   private static boolean checkIfSorted(int[] arrVal) {
      for(int i=1; i<arrVal.length; i++) {
         if(arrVal[i-1]>arrVal[i]) {
            return false;
         }
      }

      return true;
   }
}
