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
    public ListNode removeNodes(ListNode head) {
        ListNode nhead = reverseList(head);
        int max = nhead.val;
        ListNode cur = nhead;
        while(cur.next != null)
        {
            if(cur.next.val < cur.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return reverseList(nhead);
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        var nhead = reverseList(head.next);
        var temp = head.next;
        head.next = null;
        temp.next = head;
        return nhead;
    }
}