package com.practice.dsa.beginner.doubledimentionalarrays;

/*
* Problem Description
*
* Given a 2D array A of N rows and M columns. Find value of largest element in each row.
*
* */
public class LargestInEachRow {
   public static void main(String[] args) {
      int[][] matrix = {{1, 2}, {1, 3}};
      int[] largestNumArr = new int[matrix.length];

      for(int i=0; i<matrix.length; i++) {
         int largestNum = Integer.MIN_VALUE;
         for(int j=0; j<matrix[i].length; j++) {
            if(largestNum < matrix[i][j]) {
               largestNumArr[i] = matrix[i][j];
            }
         }
      }

      for(int num : largestNumArr) {
         System.out.print(num + " ");
      }
   }
}
