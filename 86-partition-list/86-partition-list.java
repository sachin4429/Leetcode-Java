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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode shead = small, bhead = big;
        while(head!=null)
        {
            if(x>head.val)
            {
                ListNode temp = new ListNode(head.val);
                shead.next = temp;
                shead = shead.next;
            }
            else
            {
                ListNode temp = new ListNode(head.val);
                bhead.next = temp;
                bhead = bhead.next;
            }
            head = head.next;
        }
        bhead.next = null;
        shead.next = big.next;
        return small.next;
    }
}