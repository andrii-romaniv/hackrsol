package algorithms.firecode.level_2.delete_At_Tail_Circular;

import algorithms.ListNode;

public class Solution {

    public ListNode deleteAtTail(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = null, fast = head;
        while (fast.next != head) {
            slow = fast;
            fast = fast.next;
        }
        slow.next = fast.next;
        return head;


    }
}