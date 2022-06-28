class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k = 0;
    public KthLargest(int t, int[] nums) {
        k = t;
        for(int i : nums)
        {
            if(k>0)
            {
                k--;
                pq.add(i);
            }
            else
            {
                if(pq.peek()<i)
                {
                    pq.poll();
                    pq.add(i);
                }
            }
        }
    }
    
    public int add(int val) {
        if(k>0)
        {
            k--;
            pq.add(val);
        }
        else if(pq.peek()<val)
        {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */