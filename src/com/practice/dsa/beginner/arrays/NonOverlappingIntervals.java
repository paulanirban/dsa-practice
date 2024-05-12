package com.practice.dsa.beginner.arrays;

import java.util.Arrays;

public class NonOverlappingIntervals {
   public static void main(String[] args) {
      int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};
      Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);

      int overlappingIntervals = 0;
      int currentInterval = intervals[0][1];

      for(int i=1; i<intervals.length; i++) {
         if(intervals[i][0] >= currentInterval) {
            currentInterval = intervals[i][1];
         } else {
            overlappingIntervals++;
         }
      }

      System.out.println(overlappingIntervals);
   }
}
