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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f = head, s = null, p = null;
        while(n>0)
        {
            f = f.next;
            n--;
        }
        s = head;
        if(f == null)
            return head.next;
        while(f != null)
        {
            f = f.next;
            p = s;
            s = s.next; 
        }
        p.next = s.next;
        return head;
    }
}