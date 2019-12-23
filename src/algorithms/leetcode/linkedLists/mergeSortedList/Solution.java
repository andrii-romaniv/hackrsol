package algorithms.leetcode.linkedLists.mergeSortedList;

import algorithms.ListNode;


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode answer = new ListNode(0);
        ListNode result = answer;
        while (l1 != null && l2 != null){
            if (l1.data > l2.data){
                answer.next = new ListNode(l2.data);
                l2 = l2.next;
            } else {
                answer.next = new ListNode(l1.data);
                l1 = l1.next;
            }
            answer = answer.next;
        }
        answer.next = l1 == null? l2 : l1;
        return result;

    }
}