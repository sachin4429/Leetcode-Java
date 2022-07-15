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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        var first = head;
        int l = k; 
        while(l>1)
        {
            first = first.next;
            l--;
        }
        var dummy = first;
        var second = head;
        while(dummy.next!=null)
        {
            second = second.next;
            dummy = dummy.next;
        }
        swap(first, second);
        return head;
    }
    public void swap(ListNode a, ListNode b)
    {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
}