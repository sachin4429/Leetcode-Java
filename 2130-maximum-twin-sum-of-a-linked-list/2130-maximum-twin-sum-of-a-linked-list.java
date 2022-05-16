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
    ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        var nhead = reverse(head.next);
        var temp = head.next;
        temp.next = head;
        head.next = null;
        return nhead;
    }
    public int pairSum(ListNode head) {
        var fast = head;
        var slow = head;
        int res = 0;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = reverse(slow);
        slow = head;
        while(fast != null)
        {
            res = Math.max(res, slow.val+fast.val);
            slow = slow.next;
            fast = fast.next;
        }
        return res;
    }
}