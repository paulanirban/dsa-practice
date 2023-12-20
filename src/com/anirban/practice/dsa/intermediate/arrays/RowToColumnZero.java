package com.anirban.practice.dsa.intermediate.arrays;

/*
* You are given a 2D integer matrix A,
* make all the elements in a row or column zero
* if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
* */

public class RowToColumnZero {
    public static void main(String[] args) {
        int[][] arrMatrix = {{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 2, 0, 4}};
        setMatrixZeros(arrMatrix);

        for(int[] rows : arrMatrix) {
            String seperator = "";
            System.out.print("[");
            for(int colum : rows) {
                System.out.print(seperator + colum);
                seperator = ", ";
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static void setMatrixZeros(int[][] arrMatrix) {
        boolean[] rows = new boolean[arrMatrix.length];
        boolean[] columns = new boolean[arrMatrix[0].length];

        for(int i=0; i<arrMatrix.length; i++) {
            for(int j=0; j<arrMatrix[i].length; j++) {
                if(arrMatrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for(int i=0; i<arrMatrix.length; i++) {
            for(int j=0; j<arrMatrix[i].length; j++) {
                if(rows[i] || columns[j]) {
                    arrMatrix[i][j] = 0;
                }
            }
        }
    }
}
