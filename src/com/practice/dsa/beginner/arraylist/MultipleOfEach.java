package com.practice.dsa.beginner.arraylist;

import java.util.ArrayList;

/*
* Problem Description
*
* Given 2 arrays of integers A and B
* Return a 2D array of integers such that i-th row of the array contains
* list of values in A such that A[j]%B[i]==0 in A in sequential order
*
* Input 1:
* A = [1, 2, 3, 4]
* B = [1, 2]
*
* Input 2:
* A = [2, 5, 9, 3, 8]
* B = [3, 2]
*
* Output 1:
* [ [1, 2, 3, 4 ], [ 2, 4] ]
*
* Output 2:
* [ [9, 3 ], [ 2, 8] ]
*
* */
public class MultipleOfEach {
   public static void main(String[] args) {
      int[] arrNums = {1, 2, 3, 4};
      int[] values = {1, 2};

      ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();

      for(int val: values) {
         ArrayList<Integer> lst = new ArrayList<>();
         for(int num: arrNums) {
            if(num % val == 0) {
               lst.add(num);
            }
         }
         arrList.add(lst);
      }

      int[][] arrVals = new int[arrList.size()][];
      int i =0;
      for(ArrayList<Integer> lst : arrList) {
         int[] arr = new int[lst.size()];
         int j =0;
         for(int val : lst) {
            arr[j] = val;
            j++;
         }
         arrVals[i] = arr;
         i++;
      }

      for(int[] arr: arrVals) {
         for(int num: arr) {
            System.out.print(num + " ");
         }
         System.out.println();
      }
   }
}
