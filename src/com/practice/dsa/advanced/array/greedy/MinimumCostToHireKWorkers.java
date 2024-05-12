package com.practice.dsa.advanced.array.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import javafx.util.Pair;

public class MinimumCostToHireKWorkers {
   public static void main(String[] args) {
      int[] quality = {3,1,10,10,1};
      int[] wage = {4,8,2,2,7};
      int k = 3;

      Pair<Double, Integer>[] workers = new Pair[quality.length];
      int i=0;
      for(int wageAmount: wage) {
         workers[i] = new Pair<>((double) wageAmount / quality[i], quality[i]);
         i++;
      }
      Arrays.sort(workers, (a, b) -> Double.compare(a.getKey(), b.getKey()));

      double miniumPossibleWage = Double.MAX_VALUE;
      int qualitySum = 0;
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(Pair<Double, Integer> worker : workers) {
         double ratio = worker.getKey();
         int qualityUnit = worker.getValue();
         pq.offer(qualityUnit);

         qualitySum += qualityUnit;
         if(pq.size() > k) {
            qualitySum -= pq.poll();
         }

         if(pq.size() == k) {
            miniumPossibleWage = Math.min(miniumPossibleWage, qualitySum * ratio);
         }
      }

      System.out.println(miniumPossibleWage);
   }
}
