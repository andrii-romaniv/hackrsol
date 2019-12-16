package algorithms.leetcode.linkedLists.evenOddLinkedList;

import algorithms.ListNode;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        int index = 0;
        ListNode curr = head;
        ListNode evenNode = new ListNode(-1);
        ListNode evenPointer = evenNode;
        ListNode oddNode = new ListNode(-1);
        ListNode oddPointer = oddNode;
        while (curr != null){
            if (index%2 == 0){
                evenPointer.next = curr;
                evenPointer = evenPointer.next;
            } else {
                oddPointer.next = curr;
                oddPointer = oddPointer.next;
            }
            curr = curr.next;
            ++index;
        }
        oddPointer.next = null;
        evenPointer.next = oddNode.next;
        return evenNode.next;
    }
}