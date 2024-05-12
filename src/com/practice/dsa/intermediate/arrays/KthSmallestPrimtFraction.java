package com.practice.dsa.intermediate.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestPrimtFraction {
   public static void main(String[] args) {
      int[] arr = {1,2,3,5};
      int k = 3;

      PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
         double fraction1 = (double) o1[0] / o1[1];
         double fraction2 = (double) o2[0] / o2[1];
         return Double.compare(fraction1, fraction2);
      });

      for(int i=0; i<arr.length; i++) {
         for(int j=i+1; j<arr.length; j++) {
            pq.offer(new int[]{arr[i], arr[j]});
         }
      }

      int count = 1;
      while(count < k) {
         pq.poll();
         count++;
      }

      System.out.println(Arrays.toString(pq.peek()));
   }
}
