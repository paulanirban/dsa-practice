package com.practice.dsa.intermediate.bitmanipulations;

/*
* Alex has a cat named Boomer. He decides to put his cat to the test for eternity.
* He starts on day 1 with one stash of food unit, every next day, the stash doubles.
*
* If Boomer is well behaved during a particular day, only then she receives food worth equal to
* the stash produced on that day.
*
* Boomer receives a net worth of A units of food. What is the number of days she received the stash?
* */
public class FindingGoodDays {

   public static void main(String[] args) {
      int totalUnit = 8;
      System.out.println(getGoodDays(totalUnit));
   }

   private static int getGoodDays(int num) {
      int count = 0;
      while(num > 0) {
         if(num % 2 != 0) {
            count++;
         }
         num /= 2;
      }

      return count;
   }
}
