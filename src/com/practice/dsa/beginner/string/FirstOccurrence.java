package com.practice.dsa.beginner.string;

/*
* Problem Description
*
* You are given a character string A, having length N and an integer ASCII code B.
* You have to tell the leftmost occurrence of the character having ASCII code equal
* to B, in A or report that it does not exist.
*
* */
public class FirstOccurrence {
   public static void main(String[] args) {
      final String str = "aabbcc";
      final int asciiNum = 98;

      int i=0;
      for(char ch: str.toCharArray()) {
         if((int)ch == asciiNum) {
            System.out.println(i);
            break;
         }
         i++;
      }
   }
}
