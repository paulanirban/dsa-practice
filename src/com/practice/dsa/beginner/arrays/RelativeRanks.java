package com.practice.dsa.beginner.arrays;

import java.util.ArrayList;
import java.util.Comparator;

public class RelativeRanks {
   public static void main(String[] args) {
      int[] score = {10, 3, 8, 9, 4};

      ArrayList<Integer> rankList = new ArrayList<>();
      for(int num: score) {
         rankList.add(num);
      }
      rankList.sort(Comparator.reverseOrder());

      String[] strArr = new String[score.length];
      for(int i=0; i<score.length; i++) {
         int rank = rankList.indexOf(score[i]);
         String rankTitle;
         if(rank == 0) {
            rankTitle = "Gold";
         } else if(rank == 1) {
            rankTitle = "Silver";
         } else if(rank == 2) {
            rankTitle = "Bronze";
         } else {
            rankTitle = String.valueOf(rank + 1);
         }
         strArr[i] = rankTitle;
      }

      for(String str: strArr) {
         System.out.println(str);
      }
   }
}
