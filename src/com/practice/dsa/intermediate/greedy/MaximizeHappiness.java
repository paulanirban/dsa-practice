package com.practice.dsa.intermediate.greedy;

import java.util.Arrays;

public class MaximizeHappiness {
   public static void main(String[] args) {
      int[] happinessArray = {2, 3, 4, 5};
      int turns = 1;

      Arrays.sort(happinessArray);
      int maxHappiness = 0;
      int happinessDecrement = 0;
      for(int i=happinessArray.length - 1; i >= happinessArray.length - turns; i--) {
         maxHappiness += Math.max(0, happinessArray[i] - happinessDecrement);
         happinessDecrement++;
      }

      System.out.println(maxHappiness);
   }
}
