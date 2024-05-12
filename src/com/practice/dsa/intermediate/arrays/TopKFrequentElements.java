package com.practice.dsa.intermediate.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
   public static void main(String[] args) {
      int[] nums = {-1, -1};
      int k = 1;

      HashMap<Integer, Integer> frequencyMap = new HashMap<>();
      for(int num : nums) {
         frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
      }

      PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
      for(int key : frequencyMap.keySet()) {
         pq.offer(new int[]{key, frequencyMap.get(key)});
      }

      int[] resultArr = new int[k];
      for(int i=0; i<k; i++) {
         int[] tempArr = pq.poll();
         resultArr[i] = tempArr[0];
      }

      System.out.println(Arrays.toString(resultArr));
   }
}
