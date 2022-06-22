class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int k = 0;
        for(int i : nums)
        {
            if(k<2)
            {
                pq.add(i);
                k++;
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
        int a = pq.poll()-1, b = pq.poll()-1;
        return a*b;
    }
}