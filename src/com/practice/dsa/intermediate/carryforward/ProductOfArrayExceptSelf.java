package com.practice.dsa.intermediate.carryforward;

public class ProductOfArrayExceptSelf {
   public static void main(String[] args) {
      int[] arr = {-1, 1, 0, -3, 3};

      int arrLength = arr.length;

      int[] leftProdArr = new int[arrLength];
      leftProdArr[0] = 1;
      int[] rightProdArr = new int[arrLength];
      rightProdArr[arrLength-1] = 1;

      for(int i=1; i<arrLength; i++) {
         leftProdArr[i] = leftProdArr[i-1] * arr[i-1];
      }

      for(int i=arrLength-2; i>=0; i--) {
         rightProdArr[i] = rightProdArr[i+1] * arr[i+1];
      }

      for(int i=0; i<arrLength; i++) {
         arr[i] = leftProdArr[i] * rightProdArr[i];
      }
      System.out.println("dsd");
   }
}
