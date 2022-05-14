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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        ListNode node  = head;
        int count = 0;
        while(node.next!= null)
        {
            node = node.next;
            count +=1;
        }
         k = k%(count+1);
        node.next = head;
        node  = head;
        for(int i = 0; i<(count-k); i++)
        {
            node = node.next;
        }
        head = node.next;
        node.next = null;
        return head;
    }
}