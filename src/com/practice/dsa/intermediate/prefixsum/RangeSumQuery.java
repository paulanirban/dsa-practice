package com.practice.dsa.intermediate.prefixsum;

public class RangeSumQuery {
   public static void main(String[] args) {
      int[] arr = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
      int[][] query = {{6, 9}, {2, 9}, {2, 4}, {0, 9}};

      for(int i=1; i<arr.length; i++) {
         arr[i] += arr[i-1];
      }

      for(int[] range: query) {
         int start = range[0] == 0 ? 0 : arr[range[0] - 1];
         System.out.println(arr[range[1]] - start);
      }
   }
}
