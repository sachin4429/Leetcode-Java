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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        ListNode head = new ListNode();
        ListNode res = head;
        while(l1 != null && l2 != null)
        {
            if(l1.val == l2.val)
            {
                ListNode temp1 = new ListNode();
                ListNode temp2 = new ListNode();
                temp1.val = l1.val;
                temp2.val = l2.val;
                head.next = temp1;
                head = head.next;
                head.next = temp2;
                head = head.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1.val < l2.val)
            {
                ListNode temp = new ListNode();
                temp.val = l1.val;
                head.next = temp;
                head = head.next;
                l1 = l1.next;
            }
            else if(l1.val > l2.val)
            {
                ListNode temp = new ListNode();
                temp.val = l2.val;
                head.next = temp;
                head = head.next;
                l2 = l2.next;
            }
        }
        if(l1 != null)
        {
            head.next = l1;
        }
        if(l2 != null)
        {
            head.next = l2;
        }
        return res.next;
    }
}