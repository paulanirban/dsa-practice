package com.practice.dsa.beginner.hashmapandhashset;

import java.util.HashSet;
import java.util.Set;

/*
* Problem Description
*
* Given an array A of N integers, return the number of unique elements in the array.
*
* */
public class CountDistinct {
   public static void main(String[] args) {
      int[] arrVal = {3, 3, 3, 9, 0, 1, 0};

      Set<Integer> numSet = new HashSet<>();

      for(int num : arrVal) {
         numSet.add(num);
      }

      System.out.println(numSet.size());
   }
}
