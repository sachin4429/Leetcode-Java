class Solution {
    class Node{
        int ele;
        int ind;
        Node(int ele,int ind)
        {
            this.ele = ele;
            this.ind = ind;
        }
    }
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>((a,b)->a.ele-b.ele);
        for(int i = 0; i<nums.length; i++)
        {
            if(k>0)
            {
                k--;
                pq.add(new Node(nums[i],i));
            }
            else
            {
                if(pq.peek().ele < nums[i])
                {
                    pq.poll();
                    pq.add(new Node(nums[i],i));
                }
            }
        }
        Node[] arr = new Node[pq.size()];
        int j = 0;
        while(!pq.isEmpty())
        {
            arr[j++] = pq.poll();
        }
        Arrays.sort(arr,(a,b)->a.ind-b.ind);
        int[] res = new int[arr.length];
        for(int i = 0; i<res.length; i++)
            res[i] = arr[i].ele;
        return res;
    }
}