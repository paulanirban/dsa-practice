package com.practice.dsa.beginner.arrays;


import java.util.Scanner;

/*
* Problem Description
*
* Take input an array A of size N and write a program to print
* maximum and minimum elements of the input. The only line of the
* input would contain a single integer N that represents the length
* of the array followed by the N elements of the input array A.
* */
public class MaxAndMinOfAnArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arrLength = sc.nextInt();
      int[] arrVal = new int[arrLength];

      int maxVal = Integer.MIN_VALUE;
      int minVal = Integer.MAX_VALUE;

      for(int i=0; i<arrLength; i++) {
         arrVal[i] = sc.nextInt();

         if(arrVal[i] > maxVal) {
            maxVal = arrVal[i];
         }

         if(arrVal[i] < minVal) {
            minVal = arrVal[i];
         }
      }

      System.out.println(maxVal +" "+minVal);
   }
}
