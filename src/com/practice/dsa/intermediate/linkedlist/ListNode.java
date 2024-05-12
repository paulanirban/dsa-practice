package com.practice.dsa.intermediate.linkedlist;

public class ListNode {
   int val;
   com.practice.dsa.intermediate.linkedlist.ListNode next;
   ListNode() {}
   ListNode(int val) {
      this.val = val;
   }
   ListNode(int val, com.practice.dsa.intermediate.linkedlist.ListNode next) {
      this.val = val; this.next = next;
   }
}
