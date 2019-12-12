package algorithms.leetcode.linkedLists.evenOddLinkedList;

import algorithms.firecode.ListNode;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode p = head;
        while (true){
            if (p==null){
                return p;
            }
            if (p.next == null){
                return p;
            }
            p = p.next.next;
        }

    }
}