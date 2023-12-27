package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
* Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx
* The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
* */
public class ValidSudoku {
   public static void main(String[] args) {
      String[] sudokuStrArr = {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
      System.out.println(isValidSudoku(sudokuStrArr));
   }

   private static int isValidSudoku(String[] sudokuStrArr) {
      int[][] sudokuIntArr = new int[sudokuStrArr.length][sudokuStrArr.length];

      for(int i=0; i<sudokuStrArr.length; i++) {
         for(int j=0; j<sudokuStrArr[i].length(); j++) {
            sudokuIntArr[i][j] = sudokuStrArr[i].charAt(j) == '.' ? -1 : Integer.parseInt(String.valueOf(sudokuStrArr[i].charAt(j)));
         }
      }

      HashMap<Integer, Integer> rowMap;
      HashMap<Integer, Integer> columnMap;
      for(int i=0; i<sudokuIntArr.length; i++) {
         rowMap = new HashMap<>();
         columnMap = new HashMap<>();
         for(int j=0; j<sudokuIntArr[i].length; j++) {
            if(sudokuIntArr[i][j] != -1) {
               if (rowMap.containsKey(sudokuIntArr[i][j])) {
                  return 0;
               }
               rowMap.put(sudokuIntArr[i][j], 1);
            }

            if(sudokuIntArr[j][i] != -1) {
               if (columnMap.containsKey(sudokuIntArr[j][i])) {
                  return 0;
               }
               columnMap.put(sudokuIntArr[j][i], 1);
            }
         }
      }

      HashMap<Integer, Integer> boxMap;
      for(int i=0; i<sudokuIntArr.length; i+=3) {
         for(int j=0; j<sudokuIntArr[i].length; j+=3) {
            boxMap = new HashMap<>();
            for(int x=i; x<i+3; x++) {
               for(int y=j; y<j+3; y++) {
                  if(sudokuIntArr[x][y] != -1) {
                     if (boxMap.containsKey(sudokuIntArr[x][y])) {
                        return 0;
                     }
                     boxMap.put(sudokuIntArr[x][y], 1);
                  }
               }
            }
         }
      }

      return 1;
   }
}
