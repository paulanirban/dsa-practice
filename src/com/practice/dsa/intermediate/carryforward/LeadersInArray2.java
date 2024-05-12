package com.practice.dsa.intermediate.carryforward;

import java.util.ArrayList;

/*
* Problem Description
*
* Given an integer array A containing N distinct integers,
* you have to find all the leaders in array A.
* An element is a leader if it is strictly greater than all the elements to its right side.
*
* NOTE: The rightmost element is always a leader.
*
* */
public class LeadersInArray2 {
   public static void main(String[] args) {
      int[] arr = {16, 17, 4, 3, 5, 2};
      ArrayList<Integer> leaderList = new ArrayList<>();
      int leader = Integer.MIN_VALUE;

      for(int i=arr.length-1; i>=0; i--) {
         if(arr[i] > leader) {
            leaderList.add(arr[i]);
            leader = arr[i];
         }
      }

//      int[] resultArr = new int[leaderList.size()];
//      int i = 0;
      for(int num: leaderList) {
         //resultArr[i++] = num;
         System.out.println(num);
      }

//      for(int num: leaderList) {
//         resultArr[i++] = num;
//      }
   }
}
