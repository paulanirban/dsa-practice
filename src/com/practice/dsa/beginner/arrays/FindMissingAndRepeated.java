package com.practice.dsa.beginner.arrays;

public class FindMissingAndRepeated {
   public static void main(String[] args) {
      int[][] grid = {{2, 2}, {3, 4}};
      int[] countArray = new int[grid.length * grid.length + 1];

      for(int[] row: grid) {
         for(int cell: row) {
            ++countArray[cell];
         }
      }

      int[] arrResult = new int[2];
      for(int i=0; i<countArray.length; i++) {
         if(countArray[i] == 2) {
            arrResult[0] = i;
         } else if(countArray[i] == 0) {
            arrResult[1] = i;
         }
      }

      System.out.println("[" + arrResult[0] + ", " + arrResult[1] +"]");
   }
}
