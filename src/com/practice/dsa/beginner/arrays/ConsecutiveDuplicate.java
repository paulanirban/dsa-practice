package com.practice.dsa.beginner.arrays;

/*
* Problem Description
*
* Write a function to check if the given array A has consecutive duplicate elements or not.
* Return True if there are consecutive duplicate elements in the list else return False.
*
* Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array
* */
public class ConsecutiveDuplicate {
   public static void main(String[] args) {
      int[] arrVals = {1, 2, 3, 3};
      System.out.println(checkConsecutiveDuplicates(arrVals));
   }

   private static boolean checkConsecutiveDuplicates(int[] arrVals) {
      for(int i=1; i<arrVals.length; i++) {
         if(arrVals[i-1] == arrVals[i]) {
            return true;
         }
      }
      return false;
   }
}
