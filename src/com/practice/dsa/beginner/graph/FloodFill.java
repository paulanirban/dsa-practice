package com.practice.dsa.beginner.graph;

public class FloodFill {
   public static void main(String[] args) {
      int[][] image = {{0, 0, 0}, {0, 0, 0}};
      int sr = 1;
      int sc = 0;
      int color = 2;
      floodFill(image, image.length, image[0].length, sr, sc, color, image[sr][sc]);

      for(int row[]: image) {
         for(int cell: row) {
            System.out.print(cell + " ");
         }
         System.out.println();
      }
   }

   private static void floodFill(int[][] image, int row, int col, int sr, int sc, int color, int previous) {
      if(sr < 0 || sr >=row || sc < 0 || sc >= col) {
         return;
      }

      if(image[sr][sc] != previous) {
         return;
      }

      image[sr][sc] = color;
      /*left move - row*/
      floodFill(image, row, col, sr - 1, sc, color, previous);

      /*right move - row*/
      floodFill(image, row, col, sr + 1, sc, color, previous);

      /*up move - column*/
      floodFill(image, row, col, sr, sc - 1, color, previous);

      /*down move - column*/
      floodFill(image, row, col, sr, sc + 1, color, previous);
   }
}
