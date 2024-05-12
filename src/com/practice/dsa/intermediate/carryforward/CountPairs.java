package com.practice.dsa.intermediate.carryforward;

/*
* Given a character array, count the number of pairs (i, j) possible
* s.t. i<j and a[i]='a' and a[j]='g'.
*
* Note : All characters are of lowercase
*
* */
public class CountPairs {
   public static void main(String[] args) {
      char[] charArr = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
      System.out.println(countPairs(charArr));
   }

   private static int countPairs(char[] arrVal) {
      int count = 0;
      int countG = 0;
      for(int i=arrVal.length-1; i>=0; i--) {
         if(arrVal[i] == 'g') {
            countG++;
         } else if(arrVal[i] == 'a') {
            count += countG;
         }
      }

      return count;
   }
}
