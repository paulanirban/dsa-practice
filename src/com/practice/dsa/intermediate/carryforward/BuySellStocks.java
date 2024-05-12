package com.practice.dsa.intermediate.carryforward;

/*
* Problem Description
*
* Say you have an array, A, for which the ith element is the price of a given stock on day i.
* If you were only permitted to complete at most one transaction
* (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*
* Return the maximum possible profit.
*
* */
public class BuySellStocks {
   public static void main(String[] args) {
      int[] stockValues = {1, 4, 5, 2, 4};

      int maxProfit = 0;
      int maxSell = stockValues[stockValues.length-1];
      for(int i=stockValues.length-2; i>=0; i--) {
         if(stockValues[i] > maxSell) {
            maxSell = stockValues[i];
         }
         maxProfit = Math.max(maxProfit, maxSell - stockValues[i]);
      }

      System.out.println(maxProfit);
   }
}
