package com.practice.dsa.beginner.arraylist;

/*
* Problem Description
*
* You are given a matrix A, you have to return an array containing sum of each row elements followed
* by sum of each column elements of the matrix.
*
* NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M),
* where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.
*
* Input 1:
* A = [[1, 2],[4, 5],[8, 9]]
*
* Output 1:
* [3, 9, 17, 13, 16]
*
* */
public class RowColumnSum {
   public static void main(String[] args) {
      int[][] matrix = {{1, 2}, {4, 5}, {8, 9}};
      int[] sumArr = new int[matrix.length + matrix[0].length];

      int i=0;
      for(; i<matrix.length; i++) {
         for(int j=0; j<matrix[i].length; j++) {
            sumArr[i] += matrix[i][j];
         }
      }

      for(int k=0; k<matrix[0].length; k++) {
         for(int j=0; j<matrix.length; j++) {
            sumArr[i] += matrix[j][k];
         }
         i++;
      }

      for(int num: sumArr) {
         System.out.println(num + " ");
      }
   }
}
