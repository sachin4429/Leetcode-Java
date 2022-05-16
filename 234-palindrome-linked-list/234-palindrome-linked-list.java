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
    public ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        while(head!=null)
        {
            var temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        var fast = head; 
        var slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = reverse(slow);
        while(fast!=null)
        {
            if(fast.val != head.val)
                return false;
            fast = fast.next;
            head = head.next;
        }
        return true;
    }
}