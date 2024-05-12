package com.practice.dsa.intermediate.arrays;

public class RainWaterTrapping {
   public static void main(String[] args) {
      int[] heightArr = {0,1,0,2,1,0,1,3,2,1,2,1};

      int[] leftMax = new int[heightArr.length];
      leftMax[0] = heightArr[0];

      int i;
      for(i=1; i<heightArr.length; i++) {
         leftMax[i] = Math.max(leftMax[i-1], heightArr[i]);
      }

      int[] rightMax = new int[heightArr.length];
      rightMax[heightArr.length-1] = heightArr[heightArr.length-1];
      for(i=heightArr.length-2; i>=0; i--) {
         rightMax[i] = Math.max(rightMax[i+1], heightArr[i]);
      }

      int result = 0;
      for(i=0; i<heightArr.length; i++) {
         result += Math.min(leftMax[i], rightMax[i]) - heightArr[i];
      }
      System.out.println(result);
   }
}
