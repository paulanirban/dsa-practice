package com.practice.dsa.intermediate.arrays;

/*
 * Given an array of integers A and multiple values in B,
 * which represents the number of times array A needs to be left rotated.
 *
 * Find the rotated array for each value and return the result in the
 * form of a matrix where ith row represents the rotated array for the ith value in B.
 * */
public class MultipleLeftRotation {

  public static void main(String[] args) {
    int[] arrVals = {1, 2, 3, 4, 5};
    int[] rotations = {2, 3};

    for (int[] vals : getRotatedArrays(arrVals, rotations)) {
      System.out.print("[");
      String separator = "";
      for (int val : vals) {
        System.out.print(separator + val);
        separator = ", ";
      }
      System.out.print("]");
      System.out.println();
    }
  }

  private static int[][] getRotatedArrays(int[] arrVals, int[] rotates) {
    int[][] results = new int[rotates.length][arrVals.length];
    int arrLength = arrVals.length;

    for (int i = 0; i < rotates.length; i++) {
      int rotation = rotates[i] % arrLength;

      int[] tempArr = new int[arrLength];
      int counter = 0;
      for (int j = rotation; j < arrLength; j++) {
        tempArr[counter++] = arrVals[j];
      }

      for (int j = 0; j < rotation; j++) {
        tempArr[counter++] = arrVals[j];
      }

      results[i] = tempArr;
    }

    return results;
  }
}
