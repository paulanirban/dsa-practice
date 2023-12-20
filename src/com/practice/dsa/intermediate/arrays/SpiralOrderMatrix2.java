package com.practice.dsa.intermediate.arrays;

/*
 * Given an integer A, generate a square matrix filled with
 * elements from 1 to A2 in spiral order and return the generated square matrix.
 *
 * 1 ------> 2
 * |         |
 * 5 --> 6   |
 * |         |
 * 4<------- 3
 *
 * [ [1,   2,  3,  4, 5],
 *   [16, 17, 18, 19, 6],
 *   [15, 24, 25, 20, 7],
 *   [14, 23, 22, 21, 8],
 *   [13, 12, 11, 10, 9] ]
 * */

public class SpiralOrderMatrix2 {
    public static void main(String[] args) {
        for(int[] rows : generateSpiralMatrix(5)) {
            for(int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateSpiralMatrix(int A) {
        int[][] spiralMatrix = new int[A][A];

        int row = 0;
        int col = 0;
        int num = 0;

        while(A > 1) {
            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = ++num;
                col++;
            }

            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = ++num;
                row++;
            }

            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = ++num;
                col--;
            }

            for (int i = 0; i < A - 1; i++) {
                spiralMatrix[row][col] = ++num;
                row--;
            }
            row++;
            col++;
            A-=2;
        }

        if(A == 1) {
            spiralMatrix[row][col] = ++num;
        }

        return spiralMatrix;
    }
}
