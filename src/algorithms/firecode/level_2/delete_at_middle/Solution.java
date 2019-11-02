package algorithms.firecode.level_2.delete_at_middle;

import algorithms.firecode.ListNode;

public class Solution {
    public ListNode deleteAtMiddle(ListNode head, int position) {
        if (position == 1) {
            return head == null? head : head.next;
        }
        ListNode curr = head;
        ListNode prevNode = curr;
        int count = 0;
        while(curr != null) {
            count++;
            if(count == position) {
                prevNode.next = curr.next;
                curr.next = null;
            }
            else {
                prevNode = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
