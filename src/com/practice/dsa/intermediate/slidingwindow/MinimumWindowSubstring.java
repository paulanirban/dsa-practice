package com.practice.dsa.intermediate.slidingwindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
   public static void main(String[] args) {
      String str1 = "ADOBECODEBANC";
      String str2 = "ABC";

      HashMap<Character, Integer> charCountMap = new HashMap<>();
      for(char ch : str2.toCharArray()) {
         charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
      }

      int[] visitedArr = new int[256];
      int minmumWindow = Integer.MAX_VALUE;
      int left = 0;
      int right = 0;
      while(right < str1.length()) {
         System.out.println("left : " + left + " right: " + right);
         visitedArr[str1.charAt(right)]++;

         boolean allPresent = true;
         for(char ch : charCountMap.keySet()) {
            if(visitedArr[ch] == 0) {
               allPresent = false;
               break;
            }
         }

         if(!allPresent) {
            right++;
         } else {
            visitedArr[str1.charAt(left)] = 0;
            minmumWindow = Math.min(minmumWindow, right - left + 1);
            left++;
         }
      }

      System.out.println(minmumWindow == Integer.MAX_VALUE ? 0 : minmumWindow);
   }
}
