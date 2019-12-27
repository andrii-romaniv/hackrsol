package algorithms.hackerrank.algorithms.deleteLinkedAtPosition;

import algorithms.ListNode;

public class Solution {
    static ListNode deleteNode(ListNode head, int position) {
        ListNode node = head;

        if (position == 0){
            return node.next;
        }

        while (--position > 0){
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

}
