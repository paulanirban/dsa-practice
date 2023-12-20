package com.practice.dsa.intermediate.arrays;

/*
 * Given a binary array A[i] -> 0 or 1, find the maximum
 * consecutive 1's we can get by replacing at least one 0 with a 1.
 * */
public class MaxConsecutiveOnesByReplace {

   public static void main(String[] args) {
      //int[] binaryNumArr = {1, 1, 0, 1, 0, 0, 1, 1, 0};
      int[] binaryNumArr = {1, 1, 1, 1, 1, 1, 1, 1, 1};
      System.out.println(getMaxConsecutiveOnes(binaryNumArr));
   }

   /* This solution is not O(N^2) but O(N+N) or O(N) as each elements will
   be touched max 2 times.*/
   private static int getMaxConsecutiveOnes(int[] arrNums) {
      int countConsecutive = 0;

      for (int i = 0; i < arrNums.length; i++) {
         if (arrNums[i] == 0) {
            int left = 0;
            for (int j = i - 1; j >= 0; j--) {
               if (arrNums[j] == 1) {
                  left++;
               } else {
                  break;
               }
            }

            int right = 0;
            for (int j = i + 1; j < arrNums.length; j++) {
               if (arrNums[j] == 1) {
                  right++;
               } else {
                  break;
               }
            }

            countConsecutive = Math.max(countConsecutive, left+right+1);
         }
      }

      if(countConsecutive==0) {
         return arrNums.length;
      }

      return countConsecutive;
   }
}