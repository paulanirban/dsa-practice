package com.practice.dsa.beginner.arrays;

import java.util.HashMap;

/*
* Problem Description
*
* You are given an integer array A, you have to return an
* integer array of same size whose ith element is the frequency count of A[i] in array A .
* */
public class FrequencyCount {
   public static void main(String[] args) {
      int[] arrVals = {1, 2, 5, 1, 5, 1};

      HashMap<Integer, Integer> frequencyMap = new HashMap<>();

      for(int i=0; i<arrVals.length; i++) {
         frequencyMap.put(arrVals[i], frequencyMap.getOrDefault(arrVals[i], 0)+1);
      }

      int[] freqeuncyArr = new int[arrVals.length];
      for(int i=0; i<freqeuncyArr.length; i++) {
         freqeuncyArr[i] = frequencyMap.get(arrVals[i]);
         System.out.print(freqeuncyArr[i] + " ");
      }
   }
}
