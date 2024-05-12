package com.practice.dsa.beginner.arrays;

/*
* 2373. Largest Local Values in a Matrix
*
* You are given an n x n integer matrix grid.
* Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
* maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
*
* In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
*
* Return the generated matrix.
*
* */
public class LargestLocalValuesInMatrix {
   public static void main(String[] args) {
      int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
      int gridLength = grid.length;
      int[][] localGrid = new int[gridLength - 2][gridLength - 2];

      for(int i=0; i < gridLength - 2; i++) {
         for(int j=0; j < gridLength - 2; j++) {
            int maxValue = Integer.MIN_VALUE;

            for(int k=i; k < i+3; k++) {
               for(int l=j; l < j+3; l++) {
                  maxValue = Math.max(maxValue, grid[k][l]);
               }
            }
            localGrid[i][j] = maxValue;
         }
      }

      for(int[] rows: localGrid) {
         for(int cell: rows) {
            System.out.print(cell + " ");
         }
         System.out.println();
      }
   }
}
