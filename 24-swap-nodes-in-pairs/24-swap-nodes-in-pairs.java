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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null, cur = head, temp = null;
        int c = 0, n = 0, k = 2;
        ListNode itr = head;
        while(cur != null && c<k)
        {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            c++;
        }
        if(temp != null)
        {
            head.next = swapPairs(temp);
        }
        return prev;
    }
}