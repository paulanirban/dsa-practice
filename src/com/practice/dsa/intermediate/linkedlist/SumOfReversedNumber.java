package com.practice.dsa.intermediate.linkedlist;

public class SumOfReversedNumber {
   public static void main(String[] args) {
      ListNode l1 = new ListNode(9);
//      l1.next = new ListNode(4);
//      l1.next.next = new ListNode(3, null);

      ListNode l2 = new ListNode(1);
      l2.next = new ListNode(9);
      l2.next.next = new ListNode(9);
      l2.next.next.next = new ListNode(9);
      l2.next.next.next.next = new ListNode(9);
      l2.next.next.next.next.next = new ListNode(9);
      l2.next.next.next.next.next.next = new ListNode(9);
      l2.next.next.next.next.next.next.next = new ListNode(9);
      l2.next.next.next.next.next.next.next.next = new ListNode(9);
      l2.next.next.next.next.next.next.next.next.next = new ListNode(9);


//      long sumStr = getNumberFromLinkedList(l1) + getNumberFromLinkedList(l2);
//      ListNode resultNode = new ListNode();
//      createLinkedList(resultNode, sumStr);
//
//      while(resultNode.next != null) {
//         System.out.print(resultNode.val + ", ");
//         resultNode.val = resultNode.next.val;
//         resultNode.next = resultNode.next.next;
//      }
//      System.out.print(resultNode.val);

      ListNode dummy = new ListNode();
      ListNode resultNode = dummy;
      int carry = 0;
      while(l1 != null || l2!= null) {
         int num1 = (l1 != null) ? l1.val : 0;
         int num2 = (l2 != null) ? l2.val : 0;

         int sum = num1 + num2 + carry;
         carry = sum / 10;

         resultNode.next = new ListNode(sum % 10);
         resultNode = resultNode.next;

         if(l1 != null) {
            l1 = l1.next;
         }

         if(l2 != null) {
            l2 = l2.next;
         }
      }

      if(carry > 0) {
         resultNode.next = new ListNode(carry);
      }

      while(dummy.next != null) {
         System.out.print(dummy.val + ", ");
         dummy.val = dummy.next.val;
         dummy.next = dummy.next.next;
      }
      System.out.print(dummy.val);
   }

   private static void createLinkedList(ListNode node, long num) {
      if(num == 0) {
         //node = null;
         return;
      }
      node.val = (int) (num%10);

      int dividend = (int) (num/10);
      if(dividend != 0) {
         node.next = new ListNode();
      }

      createLinkedList(node.next, num/10);
   }

   private static long getNumberFromLinkedList(ListNode node) {
      long num = 0;
      int increment = 1;
      while(node.next != null) {
         num += (long) increment * node.val;
         node.val = node.next.val;
         node.next = node.next.next;
         increment*=10;
      }
      num += (long) increment * node.val;

      return num;
   }
}
