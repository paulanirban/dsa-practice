package com.practice.dsa.intermediate.arrays.carryforward;

import java.util.ArrayList;

/*
* Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
* An element is a leader if it is strictly greater than all the elements to its right side.
*
* NOTE: The rightmost element is always a leader.
* */
public class LeadersInAnArray {
   public static void main(String[] args) {
      int[] arrVal = {16, 17, 4, 3, 5, 2};
      for(int val : getLeaders(arrVal)) {
         System.out.println(val);
      }
   }

   private static int[] getLeaders(int[] arrVal) {
      ArrayList<Integer> arrLst = new ArrayList<>();
      int maxVal = Integer.MIN_VALUE;

      for(int i=arrVal.length-1; i>=0; i--) {
         if(arrVal[i] > maxVal) {
            maxVal = arrVal[i];
            arrLst.add(arrVal[i]);
         }
      }

      int[] leadersArr = new int[arrLst.size()];

      for(int i=0; i<arrLst.size(); i++) {
         leadersArr[i] = arrLst.get(i);
      }

      return leadersArr;
   }
}
