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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode s, f, p = null;
        s = head;
        f = head;
        while(f != null && f.next != null)
        {
            p = s;
            s = s.next;
            f = f.next.next;
        }
        p.next = s.next;
        return head;
    }
}