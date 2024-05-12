package com.practice.dsa.beginner.arraylist;

/*
* Problem Description
*
* Given an integer A in the function parameter.
* Return a 2D array with A rows such that the i-th row has numbers from 1 to i.
*
* */
public class NumericStairPattern {
   public static void main(String[] args) {
      int num = 4;
      int[][] matrix = new int[num][];

      for(int i=0; i<num; i++) {
         int[] arr = new int[i+1];
         for(int j=0; j<=i; j++) {
            arr[j] = j+1;
         }
         matrix[i] = arr;
      }

      for(int i=0; i<matrix.length; i++) {
         for(int j=0; j<matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}
