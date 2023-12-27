package com.practice.dsa.intermediate.hashing;

import java.util.HashMap;

/*
* Surprisingly, in an alien language, they also use English lowercase letters,
* but possibly in a different order. The order of the alphabet is some permutation
* of lowercase letters.
*
* Given an array of words A of size N written in the alien language, and the order
* of the alphabet denoted by string B of size 26, return 1 if and only if the given
* words are sorted lexicographically in this alien language else, return 0.
* */
public class IsDictionary {

   public static void main(String[] args) {
      String[] arrWords = {"ipial","qjqgt","vfnue","vjqfp","eghva","ufaeo","atyqz","chmxy","ccvgv","ghtow"};
      String order = "nbpfhmirzqxsjwdoveuacykltg";
      System.out.println(checkLexicographicallySorted(arrWords, order));
   }

   private static int checkLexicographicallySorted(String[] arrWords, String order) {
      HashMap<Character, Integer> lexOrderMap = new HashMap<>();

      int i=0;
      for(char ch : order.toCharArray()) {
         lexOrderMap.put(ch, ++i);
      }

      for (i = 1; i < arrWords.length; i++) {
         String word1 = arrWords[i - 1];
         String word2 = arrWords[i];

         int minLength = Math.min(word1.length(), word2.length());

         for (int j = 0; j < minLength; j++) {
            char char1 = word1.charAt(j);
            char char2 = word2.charAt(j);

            if (lexOrderMap.get(char1) < lexOrderMap.get(char2)) {
               break; // word1 is lexicographically before word2
            } else if (lexOrderMap.get(char1) > lexOrderMap.get(char2)) {
               return 0; // word1 is lexicographically after word2
            }
         }

         // If the common prefix is the same, check the lengths
         if (word1.length() > word2.length()) {
            return 0;
         }
      }

      return 1;
   }
}
