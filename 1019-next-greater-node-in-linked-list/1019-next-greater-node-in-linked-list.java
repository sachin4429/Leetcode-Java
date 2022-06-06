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
    public int[] nextLargerNodes(ListNode head) {
        var itr = head;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        while(itr != null)
        {
            arr.add(itr.val);
            itr = itr.next;
        }
        int[] res = new int[arr.size()];
        Stack<Integer> s = new Stack<Integer>();
        for(int i = res.length-1; i>=0; i--)
        {
            if(s.isEmpty())
            {
                s.push(arr.get(i));
            }
            else if(s.peek() <= arr.get(i))
            {
                while(!s.isEmpty() && s.peek() <= arr.get(i))
                    s.pop();
                if(s.isEmpty())
                {
                    s.push(arr.get(i));
                } 
                else
                {
                    res[i] = s.peek();
                    s.push(arr.get(i));
                }
            }
            else
            {
                res[i] = s.peek();
                s.push(arr.get(i));
            }
        }
        
        return res;
    }
}