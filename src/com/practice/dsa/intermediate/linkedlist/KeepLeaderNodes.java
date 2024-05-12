package com.practice.dsa.intermediate.linkedlist;

public class KeepLeaderNodes {
   public static void main(String[] args) {
      ListNode node = new ListNode(5);
      node.next = new ListNode(2);
      node.next.next = new ListNode(13);
      node.next.next.next = new ListNode(3);
      node.next.next.next.next = new ListNode(8);

      iterateNodes(node);
      System.out.println("ll");
   }

   private static ListNode iterateNodes(ListNode node) {
      if(node == null) {
         return null;
      }

      node.next = iterateNodes(node.next);

      return node.next!= null && node.val < node.next.val ? node.next : node;
   }
}
