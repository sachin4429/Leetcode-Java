/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null, cur = head, temp = null;
        int c = 0, n = 0;
        ListNode itr = head;
        while(itr != null)
        {
            itr = itr.next;
            n++;
        }
        int tcall = n/k, pcall = 1;
        while(cur != null && c<k)
        {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            c++;
        }
        if(temp != null && pcall<tcall)
        {
            head.next = reverseKGroup(temp, k);
            pcall++;
        }
        else if(temp != null)
        {
            head.next = temp;
        }
        return prev;
    }
}