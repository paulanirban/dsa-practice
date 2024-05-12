package com.practice.dsa.intermediate.carryforward;

/*
* Problem Description
*
* A wire connects N light bulbs. Each bulb has a switch associated with it;
* however, due to faulty wiring, a switch also changes the state of all the
* bulbs to the right of the current bulb.
* Given an initial state of all bulbs, find the minimum number of switches
* you have to press to turn on all the bulbs.
* You can press the same switch multiple times.
*
* Note: 0 represents the bulb is off and 1 represents the bulb is on.
*
* */
public class Bulbs {
   public static void main(String[] args) {
      int[] arrStates = {0, 1, 0, 1};
      int count = 0;
      int state = 0;
      for(int i=0; i<arrStates.length; i++) {
         if(arrStates[i] == state) {
            count++;
            state = 1 - state;
         }
      }

      System.out.println(count);
   }
}
