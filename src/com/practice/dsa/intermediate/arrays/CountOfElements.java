package com.practice.dsa.intermediate.arrays;

/*
*
* Problem Description
*
* Given an array A of N integers.
* Count the number of elements that have at least 1 elements greater than itself.
*
* Input 1:
* A = [3, 1, 2]
*
* Input 2:
* A = [5, 5, 3]
*
* Example Output
* Output 1:
* 2
*
* Output 2:
* 1
*
* */
public class CountOfElements {
   public static void main(String[] args) {
      int[] arrNum = {3,5,3,2,9,3,10,10,10,3};

      int maxVal = 0;
      int countMax = 0;

      for(int i=0; i<arrNum.length; i++) {
         if(arrNum[i] > maxVal) {
            maxVal = arrNum[i];
            countMax = 1;
         } else if(arrNum[i] == maxVal) {
            countMax++;
         }
      }

      System.out.println(arrNum.length - countMax);
   }
}
