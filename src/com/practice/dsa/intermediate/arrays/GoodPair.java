package com.practice.dsa.intermediate.arrays;

import java.util.HashMap;

/*
*
* Problem Description
* Given an array A and an integer B. A pair(i, j) in the array is a good
* pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
* */
public class GoodPair {
   public static void main(String[] args) {
      int[] arr = {1, 2, 2};
      int target = 4;

      HashMap<Integer, Integer> complementMap = new HashMap<>();

      for(int num: arr) {
         int complement = target - num;
         if(complementMap.containsKey(num)) {
            System.out.println("Good pair found!");
            break;
         }
         complementMap.put(complement, num);
      }
   }
}
