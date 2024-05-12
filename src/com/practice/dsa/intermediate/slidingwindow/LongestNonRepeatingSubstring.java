package com.practice.dsa.intermediate.slidingwindow;

public class LongestNonRepeatingSubstring {
   public static void main(String[] args) {
      String str = "pwwkew";

//      if(str.length() == 0 || str.length() == 1) {
//         System.out.println("Longest substring: " + str.length());
//      }

      int maxLength = 0;
      boolean[] visited = new boolean[256];
      int left = 0, right = 0;

      while(right < str.length()) {
         if(visited[str.charAt(right)]) {
            while(visited[str.charAt(right)]) {
               visited[str.charAt(left)] = false;
               left++;
            }
         }

         visited[str.charAt(right)] = true;
         maxLength = Math.max(maxLength, right - left + 1);
         right++;
      }

      System.out.println("Longest substring: " + maxLength);
   }
}
