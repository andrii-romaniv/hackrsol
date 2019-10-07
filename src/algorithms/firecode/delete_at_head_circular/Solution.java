package algorithms.firecode.delete_at_head_circular;

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
