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
    public ListNode reverse(ListNode l)
    {
        ListNode prev = null;
        ListNode rev = null;
        while(l != null)
        {
            ListNode temp = l.next;
            l.next = prev;
            prev = l;
            l = temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode res = new ListNode();
        ListNode head = res;
        int sum = 0, carry = 0;
        while(l1 != null && l2 != null)
        {
            sum = l1.val + l2.val + carry;
            ListNode temp = new ListNode();
            temp.val = sum % 10;
            carry = sum/10; 
            res.next = temp;
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        while(l1 != null)
        {
           sum = l1.val + carry;
            ListNode temp = new ListNode();
            temp.val = sum % 10;
            carry = sum/10; 
            res.next = temp;
            l1 = l1.next;
            res = res.next; 
        }
        while(l2 != null)
        {
           sum = l2.val + carry;
            ListNode temp = new ListNode();
            temp.val = sum % 10;
            carry = sum/10; 
            res.next = temp;
            l2 = l2.next;
            res = res.next; 
        }
        if(carry != 0)
        {
            ListNode temp = new ListNode();
            temp.val = carry;
            res.next = temp;
        }
        return reverse(head.next);
    }
}