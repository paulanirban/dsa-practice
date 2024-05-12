package com.practice.dsa.intermediate.prefixsum;

/*
* Problem Description
*
* You are given an array A of integers of size N.
* Your task is to find the equilibrium index of the given array
* The equilibrium index of an array is an index such that the sum of
* elements at lower indexes is equal to the sum of elements at higher indexes.
* If there are no elements that are at lower indexes or at higher indexes,
* then the corresponding sum of elements is considered as 0.
*
* Note:
* ** Array indexing starts from 0.
* ** If there is no equilibrium index then return -1.
* ** If there are more than one equilibrium indexes then return the minimum index.
*
* */
public class EquilibriumIndex {
   public static void main(String[] args) {
      int[] arr = {-7, 1, 5, 2, -4, 3, 0};
      int[] arrPrefix = new int[arr.length];
      arrPrefix[0] = arr[0];
      int[] arrSuffix = new int[arr.length];
      arrSuffix[arrSuffix.length-1] = arr[arrSuffix.length-1];

      int i = 1;
      int j = arrSuffix.length-2;
      for(; i<arr.length-1 && j>=0; i++, j--) {
         arrPrefix[i] = arrPrefix[i-1] + arr[i];
         arrSuffix[j] = arrSuffix[j+1] + arr[j];
      }

      for(i=0; i<arr.length; i++) {
         if(arrPrefix[i] == arrSuffix[i]) {
            System.out.println(i + " " + arrPrefix[i]);
         }
      }
   }
}
