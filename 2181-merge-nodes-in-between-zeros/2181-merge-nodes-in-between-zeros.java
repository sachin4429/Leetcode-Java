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
    public ListNode mergeNodes(ListNode l1) {
        
        ListNode head = new ListNode();
        ListNode res = head;
        int sum = 0;
        while(l1 != null)
        {
            if(l1.val != 0)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            else
            {
                ListNode temp = new ListNode();
                temp.val = sum;
                sum = 0;
                head.next = temp;
                head = head.next;
                l1 = l1.next;
            }
        }
        
        return res.next.next;
    }
}