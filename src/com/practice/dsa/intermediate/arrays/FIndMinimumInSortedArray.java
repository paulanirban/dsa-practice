package com.practice.dsa.intermediate.arrays;

public class FIndMinimumInSortedArray {
   public static void main(String[] args) {
      int[] arr = {2, 3, 1};
      int left = 0;
      int right = arr.length - 1;
      int minVal = Integer.MAX_VALUE;

      while(left <= right) {
         if(arr[left] <= arr[right]) {
            minVal = Math.min(minVal, arr[left]);
            break;
         }

         int mid = (left + right) / 2;

         if(arr[left] <= arr[mid]) {
            minVal = Math.min(minVal, arr[left]);
            left = mid + 1;
         } else {
            minVal = Math.min(minVal, arr[mid]);
            right = mid - 1;
         }
      }

      System.out.println(minVal);
   }
}
