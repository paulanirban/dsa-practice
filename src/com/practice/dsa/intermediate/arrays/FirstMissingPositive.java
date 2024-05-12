package com.practice.dsa.intermediate.arrays;

import java.util.Arrays;

public class FirstMissingPositive {
   public static void main(String[] args) {
      int[] arr = {2, -9, 5, 11, 1, -10, 7};

      Arrays.sort(arr);
      int firstPositive = 1;
      for(int num: arr) {
         if(num > 0) {
            if (num == firstPositive) {
               firstPositive++;
            } else {
               System.out.println(firstPositive);
               break;
            }
         }
      }
   }
}
