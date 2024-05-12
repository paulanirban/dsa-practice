package com.practice.dsa.intermediate.linkedlist;

public class DoubleANumber {
   public static void main(String[] args) {
      ListNode node = new ListNode(1);
      node.next = new ListNode(8);
      node.next.next = new ListNode(9);

      makeDouble(node);
      System.out.println("kk");
   }

   private static int makeDouble(ListNode node) {
      int val = node.val * 2;
      if(node.next != null) {
         val += makeDouble(node.next);
      }

      node.val = val % 10;
      return val/10;
   }
}
