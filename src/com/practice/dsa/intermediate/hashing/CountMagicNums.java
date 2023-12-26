package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
 * Given a one-dimensional String array of "Numbers". Return the count of magic
 * numbers exist in that array.
 *
 * Magic Number : Sum of a number and its palindrome.
 *
 * E.g. in the following given String array of "Numbers", 15 + 51 = 66 and "66" is
 * available in the array
 * ["13", "21", "86", "15", "47", "66"]
 * */
public class CountMagicNums {

   public static void main(String[] args) {
      String[] numArr = {"13", "21", "86", "15", "47", "66", "66", "44"};
      System.out.println(countMagicNumbers(numArr));
   }

   private static int countMagicNumbers(String[] arrNumStrings) {
      int count = 0;

      HashMap<Integer, Integer> countMap = new HashMap<>();
      for(int i=0; i<arrNumStrings.length; i++) {
         countMap.put(Integer.parseInt(arrNumStrings[i]), countMap.getOrDefault(Integer.parseInt(arrNumStrings[i]), 0) + 1);
      }

      for(int i=0; i<arrNumStrings.length; i++) {
         int num = Integer.parseInt(arrNumStrings[i]);
         StringBuilder palindromeStr = new StringBuilder();
         for(char numChar : arrNumStrings[i].toCharArray()) {
            palindromeStr.insert(0, numChar);
         }

         int magicNum =  num +  Integer.parseInt(palindromeStr.toString());
         if(countMap.containsKey(magicNum)) {
            count += countMap.get(magicNum);
         }
      }

      return count;
   }
}
