package com.practice.dsa.beginner.arrays;

import java.util.Scanner;

/*
* Problem Description
*
* You are given T(number of test cases) integer arrays.
* For each array A, you have to find the value of absolute
* difference between the counts of even and odd elements in the array.
* */
public class EvenOddElements {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCases = sc.nextInt();

      for(int i=0; i<testCases; i++) {
         int arrayLength = sc.nextInt();
         int[] arrVals = new int[arrayLength];
         int oddCount = 0;
         int evenCount = 0;
         for(int j=0; j<arrayLength; j++) {
            arrVals[i] = sc.nextInt();

            if(arrVals[i] % 2 == 0) {
               evenCount++;
            } else {
               oddCount++;
            }
         }

         System.out.println(Math.abs(evenCount - oddCount));
      }
   }
}
