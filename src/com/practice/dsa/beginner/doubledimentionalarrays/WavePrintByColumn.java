package com.practice.dsa.beginner.doubledimentionalarrays;

import java.util.Scanner;

/*
* Problem Description
*
* Write a program to input an integer N and a N*N matrix Mat from user and print
* the matrix in wave form (column wise)
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
* 4 7 3 7 4 1 2 4 4
*
* */
public class WavePrintByColumn {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int vector = sc.nextInt();
      int[][] matrix = new int[vector][vector];

      for(int i=0; i<vector; i++) {
         for(int j=0; j<vector; j++) {
            matrix[i][j] = sc.nextInt();
         }
      }

      for(int i=0; i<vector; i++) {
//         if(i%2==0) {
//            for (int j = 0; j < vector; j++) {
//               System.out.print(matrix[j][i] + " ");
//            }
//         } else {
//            for (int j = vector - 1; j >= 0; j--) {
//               System.out.print(matrix[j][i] + " ");
//            }
//         }

         for (int j = 0; j < vector; j++) {
            int row = (i%2 != 0)? (vector - j) - 1 : j;
            System.out.print(matrix[row][i] + " ");
         }
      }
   }
}
