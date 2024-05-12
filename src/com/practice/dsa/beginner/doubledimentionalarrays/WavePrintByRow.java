package com.practice.dsa.beginner.doubledimentionalarrays;

/*
 * Problem Description
 *
 * Write a program to input an integer N and a N*N matrix Mat from user and print
 * the matrix in wave form (row wise)
 *
 * See example for clarifications regarding wave print.
 *
 * Input 1:
 * 3
 * 4 1 2
 * 7 4 4
 * 3 7 4
 *
 * Output 1:
 * 4 1 2 4 4 7 3 7 4
 *
 * */
public class WavePrintByRow {
   public static void main(String[] args) {
      int[][] matrix = {{4, 1, 2}, {7, 4, 4}, {3, 7, 4}};

      for(int i=0; i<matrix.length; i++) {
         for(int j=0; j<matrix.length; j++) {
            int column = (i%2 != 0) ? (matrix.length - j)-1 : j;
            System.out.print(matrix[i][column] + " ");
         }
      }
   }
}
