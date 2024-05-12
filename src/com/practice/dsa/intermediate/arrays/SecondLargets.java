package com.practice.dsa.intermediate.arrays;

public class SecondLargets {

   public static void main(String[] args) {
      int[] arr = {13,7,16,18,14,17,18,8,10};

      int maxItemIndex = 0;
      for(int i=1; i<arr.length; i++) {
         if(arr[i] > arr[maxItemIndex]) {
            maxItemIndex = i;
         }
      }

      int secondMax = Integer.MIN_VALUE;
      for(int i=0; i<arr.length; i++) {
         if(arr[i] != arr[maxItemIndex]) {
            secondMax = Math.max(arr[i], secondMax);
         }
      }

      System.out.println(secondMax);
   }
}
