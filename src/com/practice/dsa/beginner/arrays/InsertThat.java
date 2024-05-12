package com.practice.dsa.beginner.arrays;

/*
* Problem Description
*
* Write a program to input N numbers array, a number X and a number Y from user and insert an
* element Y in it at specified position X. X is based on 1-based indexing
*
* Note: When an element is inserted at position X, all elements that were
* already present at position >= X, gets shifted to one position right, not replaced.
*
* Problem Constraints
* 1 <= N <= 100
* 1 <= A[i] <= 1000
* 1 <= X <= N
* 1 <= Y <= 1000
*
* Input Format
* First line is N which represents number of elements.
* Second line contains N space separated integers.
* Third line is X position where Y has to be inserted.
* Fourth line is Y which is the value to be inserted.
*
* Output Format
* N+1 space separated integers of the input array after inserting the element at required position.
*
* Example Input
* 5
* 2 3 1 4 2
* 3
* 5
*
* Example Output
*
* 2 3 5 1 4 2
* */

import java.util.Scanner;

public class InsertThat {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arrLength = sc.nextInt();
      int[] arr = new int[arrLength + 1];

      for(int i=0; i<arrLength; i++) {
         arr[i] = sc.nextInt();
      }

      int position = sc.nextInt();
      int newNum = sc.nextInt();

      arrLength = arrLength + 1;

      for(int i=arrLength-1; i>position-1; i--) {
         arr[i] = arr[i-1];
      }

      arr[position-1] = newNum;

      for(int i=0; i<arrLength; i++) {
         System.out.println(arr[i] + " ");
      }
   }
}
