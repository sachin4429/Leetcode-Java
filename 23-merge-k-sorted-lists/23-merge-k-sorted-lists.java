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
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists==null||lists.length==0)
        return null;

    PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
 
    ListNode head = new ListNode(0);
    ListNode p = head;
 
    for(ListNode list: lists){
        if(list!=null)
            queue.offer(list);
    }    
 
    while(!queue.isEmpty()){
        ListNode n = queue.poll();
        p.next = n;
        p=p.next;
 
        if(n.next!=null)
            queue.offer(n.next);
    }    
 
    return head.next;
 
}
}