package algorithms.firecode.level_2.delete_at_head_circular;

import algorithms.ListNode;

public class Solution {
    public ListNode deleteAtHead(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;

        if (curr.next == curr) return null;

        while (curr.next != head){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head = curr.next;
    }
}
