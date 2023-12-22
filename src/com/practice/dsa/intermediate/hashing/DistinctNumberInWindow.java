package com.practice.dsa.intermediate.hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
* You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of
* distinct numbers in all windows of size B.
*
* Formally, return an array of size N-B+1 where i'th element in this array contains number of
* distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
*
* NOTE: if B > N, return an empty array.
* */
public class DistinctNumberInWindow {

   public static void main(String[] args) {
      int[] arrVal = {1, 2, 1, 3, 4, 3};
      int windowSize = 3;
      for(int val : getDistinctCountInWindows(arrVal, windowSize)) {
         System.out.println(val);
      }
   }

   private static int[] getDistinctCountInWindows(int[] arrVals, int windowSize) {
      int arrSize = arrVals.length;

      if(arrSize < windowSize) {
         return new int[]{};
      }

      HashMap<Integer, Integer> counterMap = new HashMap<>();
      int[] distinctCountArr = new int[arrSize - windowSize + 1];
      int counter = 0;

      for(int i=0; i<windowSize; i++) {
         counterMap.put(arrVals[i], counterMap.getOrDefault(arrVals[i], 0)+1);
      }
      distinctCountArr[counter++] = counterMap.size();

      for(int i=windowSize; i<arrSize; i++) {
         if(counterMap.get(arrVals[i - windowSize]) == 1) {
            counterMap.remove(arrVals[i - windowSize]);
         } else {
            counterMap.put(arrVals[i - windowSize], counterMap.get(arrVals[i - windowSize]) - 1);
         }

         counterMap.put(arrVals[i], counterMap.getOrDefault(arrVals[i], 0) + 1);
         distinctCountArr[counter++] = counterMap.size();
      }

      return distinctCountArr;
   }
}
