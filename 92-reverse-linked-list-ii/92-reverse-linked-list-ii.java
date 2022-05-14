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
        while(head != null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode Head, int left, int right) {
        if(Head == null || Head.next == null || left == right)
            return Head;
        ListNode head = new ListNode(0);
        ListNode itr = head;
        int count = 0;
        while(itr!= null)
        {
            itr = itr.next;
            count++;
        }
        head.next = Head;
        ListNode pre = head;
        ListNode post = head;
        for(int i = 1; i<left; i++)
            pre = pre.next;
        if(count == right)
        {
            ListNode rev = reverse(pre.next);
            pre.next = rev;
            return head.next;
        }
        for(int i = 1; i<=right; i++)
            post = post.next;
        ListNode temp = post.next;
        post.next = null;
        ListNode rev = reverse(pre.next);
        pre.next = rev;
        post = head;
        for(int i = 1; i<=right; i++)
            post = post.next;
        post.next = temp;
        return head.next;
    }
}