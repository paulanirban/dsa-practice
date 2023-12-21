package com.practice.dsa.intermediate.problemsolving;

/*
* There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and
* pass the knife to the next person standing in circle. This process continues till there is only 1
* person remaining. Find the last person standing in the circle.
* */
public class JosephusProblem {
   public static void main(String[] args) {
      System.out.println(findWinner(5, 2));
   }

   private static int findWinner(int n, int k) {
      if(n==1) {
         return 1;
      } else {
         return (findWinner(n-1, k) + k - 1) % n + 1;
      }
   }
}
