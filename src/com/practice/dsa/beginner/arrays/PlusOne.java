package com.practice.dsa.beginner.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
   public static void main(String[] args) {
      int[] digits = {1, 2, 9};
      int length = digits.length;

      int remainder = 0;
      ArrayList<Integer> numList = new ArrayList<>();
      for(int i=length - 1; i>=0; i--) {
         int temp = digits[i] + remainder;
         if(i == length - 1) {
            temp += 1;
         }

         if(temp < 10) {
            remainder = 0;
            numList.add(0, temp);
         } else {
            remainder = temp / 10;
            numList.add(0, temp % 10);
         }
      }

      if(remainder != 0) {
         numList.add(0, remainder);
      }

      System.out.println(Arrays.toString(numList.toArray()));
   }
}
