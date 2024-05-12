package com.practice.dsa.beginner.arraylist;

import java.util.Arrays;

/*
* Problem Description
*
* You are given an array A of N elements. You have to make all elements unique.
* To do so, in one step you can increase any number by one.
*
* Find the minimum number of steps.
*
* Input 1:
* A = [1, 1, 3]
*
* Input 2:
* A = [2, 4, 5]
*
* Output 1:
* 1
*
* Output 2:
* 0
*
* */
public class UniqueElementMinOps {
   public static void main(String[] args) {
      //int[] numArr = {3, 3, 3};
      int[] numArr = {51,6,10,8,22,61,56,48,88,85,21,98,81,76,71,68,18,6,14,23,72,18,56,30,97,100,81,5,99,2,85,67,46,32,66,51,76,53,36,31,81,56,26,75,69,54,54,54,83,41,86,48,7,32,85,23,47,23,18,45,79,95,73,15,55,16,66,73,13,85,14,80,39,92,66,20,22,25,34,14,51,14,17,10,100,35,9,83,31,60,24,37,69,62};

      Arrays.sort(numArr);

      int steps = 0;

      for(int i=1; i<numArr.length; i++) {
         if(numArr[i-1]>=numArr[i]) {
            int diff = numArr[i-1] - numArr[i];
            numArr[i] = numArr[i] + diff+1;
            steps += diff+1;
         }
      }

      System.out.println(steps);
   }
}
