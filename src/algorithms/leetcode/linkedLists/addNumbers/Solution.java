package algorithms.leetcode.linkedLists.addNumbers;

import algorithms.ListNode;


class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode p1=l1;
        ListNode p2=l2;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.data : 0;
            int y = (p2 != null) ? p2.data : 0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;

        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(2);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(3);
        n.next = n1;
        n1.next = n2;

        ListNode m = new ListNode(5);
        ListNode m1 = new ListNode(6);
        ListNode m2 = new ListNode(4);
        m.next = m1;
        m1.next = m2;


        ListNode res = addTwoNumbers(n, m);
    }
}