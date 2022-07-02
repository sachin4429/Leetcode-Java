class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums)
        {
            pq.add(i);
        }
        while(k>0)
        {
            int temp = pq.poll();
            temp++;
            pq.add(temp);
            k--;
        }
        long res = 1, m = 1000000007;
        while(!pq.isEmpty())
        {
            res *= pq.poll()%m; 
            res %=m;
        }
        return (int)res; 
    }
}