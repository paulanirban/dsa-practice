package com.practice.dsa.beginner.hashmapandhashset;

import java.util.HashMap;

/*
* Problem Description
*
* Given an array A. You have some integers given in the array B.
* For the i-th number, find the frequency of B[i] in the array A
* and return a list containing all the frequencies.
*
* Input 1:
* A = [1, 2, 1, 1]
* B = [1, 2]
*
* Input 2:
* A = [2, 5, 9, 2, 8]
* B = [3, 2]
*
* Example Output
* Output 1:
* [3, 1]
*
* Output 2:
* [0, 2]
*
* */
public class FrequencyOfElementQuery {
   public static void main(String[] args) {
      int[] numArr = {1, 2, 1, 1};
      int[] vals = {1, 2};

      HashMap<Integer, Integer> frequency = new HashMap<>();
      for(int num: numArr) {
         frequency.put(num, frequency.getOrDefault(num, 0) + 1);
      }

      for(int val : vals) {
         System.out.println(frequency.get(val) + " ");
      }
   }
}
