package com.practice.dsa.beginner.linkedlist;

public class MergeTwoSortedList {
   public static void main(String[] args) {
      ListNode l1 = new ListNode(1);
      l1.next = new ListNode(2);
      l1.next.next = new ListNode(4);

      ListNode l2 = new ListNode(1);
      l2.next = new ListNode(3);
      l2.next.next = new ListNode(4);

      ListNode dummyNode = new ListNode(-1);
      ListNode currentNode = dummyNode;

      while(l1 != null && l2 != null) {
         if(l1.val <= l2.val) {
            currentNode.next = l1;
            l1 = l1.next;
         } else {
            currentNode.next = l2;
            l2 = l2.next;
         }

         currentNode = currentNode.next;
      }

      if(l1 != null) {
         currentNode.next = l1;
      } else {
         currentNode.next = l2;
      }

      while(dummyNode != null) {
         System.out.println(dummyNode.val);
         dummyNode = dummyNode.next;
      }
   }
}
