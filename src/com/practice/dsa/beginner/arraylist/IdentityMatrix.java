package com.practice.dsa.beginner.arraylist;


/*
* Problem Description
*
* You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
* Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
*
* Input 1:
* [[1, 0], [0, 1]]
*
* Input 2:
* [[0, 0, 1], [0, 1, 0], [1, 0, 0]]
*
* Output 1:
* 1
*
* Output 2:
* 0
*
* */

public class IdentityMatrix {
   public static void main(String[] args) {
      int[][] matrix = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
      System.out.println(checkIfSquareMatrix(matrix));
   }

   private static boolean checkIfSquareMatrix(int[][] matrix) {

      for(int i=0; i<matrix.length; i++) {
         for(int j=0; j<matrix[i].length; j++) {
            if(i==j && matrix[i][j]!=1) {
               return false;
            } else if(i!=j && matrix[i][j]!=0) {
               return false;
            }
         }
      }

      return true;
   }
}
