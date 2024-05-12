package com.practice.dsa.advanced.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
* Given two arrays of integers A and B, Sort A in such a way that the relative order
* among the elements will be the same as those are in B.
*
* For the elements not present in B, append them at last in sorted order.
* Return the array A after sorting from the above method.
*
* NOTE: Elements of B are unique.
* */
public class SortArrayInGivenOrder {
   public static void main(String[] args) {
      int[] arrVal = {7, 12};
      int[] sortedSequence = {7, 1};

      System.out.print("[");
      String sep = "";
      for(int val : getSorted(arrVal, sortedSequence)) {
         System.out.print(sep + val);
         sep = ", ";
      }
      System.out.print("]");
   }

   private static int[] getSorted(int[] arrVal, int[] sortedSequence) {
      HashMap<Integer, Integer> countMap = new HashMap<>();

      for(int val : arrVal) {
         countMap.put(val, countMap.getOrDefault(val, 0) + 1);
      }

      int count = 0;
      int arrLen = arrVal.length;
      int[] sortedArr = new int[arrLen];
      for(int val : sortedSequence) {
         if(countMap.containsKey(val)) {
            int occurrences = countMap.get(val);
            while(occurrences > 0) {
               sortedArr[count++] = val;
               occurrences--;
            }
            countMap.remove(val);
         }
      }

      TreeMap<Integer, Integer> sortedMap = new TreeMap<>(countMap);
      for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
         int occurrences = entry.getValue();
         while(occurrences > 0) {
            sortedArr[count++] = entry.getKey();
            occurrences--;
         }
      }

      return sortedArr;
   }
}
