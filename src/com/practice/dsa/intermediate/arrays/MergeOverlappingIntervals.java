package com.practice.dsa.intermediate.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Stack;

public class MergeOverlappingIntervals {
   public static void main(String[] args) {
      Integer[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

      Arrays.sort(intervals, new Comparator<Integer[]>() {
         @Override
         public int compare(Integer[] o1, Integer[] o2) {
            return o1[0] - o2[0];
         }
      });

      Stack<Integer[]> rangeStack = new Stack<>();
      rangeStack.push(intervals[0]);

      for(int i=1; i<intervals.length; i++) {
         Integer[] top = rangeStack.peek();

         if(top[1] < intervals[i][0]) {
            rangeStack.push(intervals[i]);
         } else if(top[1] < intervals[i][1]) {
            top[1] = intervals[i][1];
            rangeStack.pop();
            rangeStack.push(top);
         }
      }

      HashMap<Integer, Integer> hm = new HashMap<>();

      while(!rangeStack.empty()) {
         Integer[] top = rangeStack.pop();
         System.out.print("["+ top[0] +","+ top[1] +"]");
         System.out.println();
      }
   }
}
