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
    public ListNode rev(ListNode head)
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = rev(slow);
        ListNode newHead = new ListNode();
        ListNode temp = newHead;
        while(head != null && secondHead != null)
        {
            newHead.next = head;
            head = head.next;
            newHead = newHead.next;
            newHead.next = secondHead;
            secondHead = secondHead.next;
            newHead = newHead.next;
        }
        newHead.next = null;
        head = temp;
    }
}