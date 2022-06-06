/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while(headA != headB)
        {
            headA = headA == null ? l2 : headA.next;
            headB = headB == null ? l1 : headB.next;
        }
        return headA;
    }
}