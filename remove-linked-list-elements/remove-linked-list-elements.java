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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;;
		while(temp != null && temp.val == val)
		{
            head = temp.next;
            temp = head;
        }
        while(temp != null)
		{
           while (temp != null && temp.val != val)
            {
                prev = temp;
                temp = temp.next;
            }
 
            // If key was not present in linked list
            if (temp == null)
                return head;
 
            // Unlink the node from linked list
            prev.next = temp.next;
 
            // Update Temp for next iteration of outer loop
            temp = prev.next;
		}
		return head;
        
    }
}