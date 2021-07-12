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
        
        //start
            ListNode ll = new ListNode();
            ListNode head = ll;
            //ListNode ln = new ListNode();
        while(l1 !=null && l2 !=null)
        {
            if(l1.val<l2.val)
                {
                ListNode temp = new ListNode();
                    temp.val=(l1.val);
                    l1=l1.next;
                    ll.next = temp;
                    ll = ll.next;
                }
            else if(l1.val>l2.val)
                {
                ListNode temp = new ListNode();
                    temp.val=(l2.val);
                    l2=l2.next;
                    ll.next = temp;
                    ll = ll.next;
                }
            else
                {
                ListNode temp1 = new ListNode();
                ListNode temp2 = new ListNode();
                    temp1.val=(l1.val);
                    temp2.val=(l2.val);
                    l1=l1.next;
                    l2=l2.next;
                    ll.next = temp1;
                    ll = ll.next;
                    ll.next = temp2;
                    ll = ll.next;
                
                }
                
        }
        
        if(l1 !=null)
        {
            ll.next = l1;
        }
        else
        {
            ll.next = l2;
        }
        
        //System.out.println(ll);
            
        return head.next;
        //End
    }
}