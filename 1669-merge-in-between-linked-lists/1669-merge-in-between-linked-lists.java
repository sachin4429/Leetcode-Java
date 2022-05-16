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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        var head1 = list1;
        var head2 = list2;
        var tail = list2;
        while(tail.next!= null)
        {
            tail = tail.next;
        }
        var temp = list1;
        while(temp != null)
        {
            temp = temp.next;
            b--;
            if(b == 0)
                break;
        }
        while(head1 != null)
        {
            if(a==1)
               break;
            head1 = head1.next;
            a--;
        }
        head1.next = head2;
        tail.next = temp.next;
        temp.next = null;
        return list1;
    }
}