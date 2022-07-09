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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        var slow = head;
        var fast = head;
        while(fast.next != null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        var head2 = slow.next;
        slow.next = null;
        return merge(sortList(head), sortList(head2));
    }
    public ListNode merge(ListNode h1, ListNode h2)
    {
        if(h1 == null)
            return h2;
        if(h2 == null)
            return h1;
        if(h1.val < h2.val)
        {
            h1.next = merge(h1.next,h2);
            return h1;
        }
        else
        {
            h2.next = merge(h2.next, h1);
            return h2;
        }
    }
}