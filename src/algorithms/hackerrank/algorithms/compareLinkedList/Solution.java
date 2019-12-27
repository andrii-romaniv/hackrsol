package algorithms.hackerrank.algorithms.compareLinkedList;

import algorithms.ListNode;

public class Solution {
    static boolean compareLists(ListNode head1, ListNode head2) {
        while (head1 != null && head2!= null){
            if (head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1 == null && head2 == null);
    }
}
