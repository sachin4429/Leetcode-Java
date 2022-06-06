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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums)
            hs.add(i);
        var itr = head;
        int cnt = 0;
        while(itr != null && !hs.isEmpty())
        {
            if(hs.contains(itr.val))
            {
                while(!hs.isEmpty() && hs.contains(itr.val))
                {
                    hs.remove(itr.val);
                    itr = itr.next;
                }
                cnt++;
            }
            else
            {
                itr = itr.next;
            }
        }
        return cnt;
    }
}