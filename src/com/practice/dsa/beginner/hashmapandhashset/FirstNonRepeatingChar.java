package com.practice.dsa.beginner.hashmapandhashset;

import java.util.HashMap;

/*
* Given a string, find the first non repeating character
* */
public class FirstNonRepeatingChar {
   public static void main(String[] args) {
      String str = "geeksforgeeks";

      HashMap<Character, Integer> characterFrequency = new HashMap<>();

      for(char ch : str.toCharArray()) {
         characterFrequency.put(ch, characterFrequency.getOrDefault(ch, 0) + 1);
      }

      for(char ch : str.toCharArray()) {
         if(characterFrequency.get(ch) == 1) {
            System.out.println(ch);
            break;
         }
      }
   }
}
