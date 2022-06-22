class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> b-a);
        for(int i : stones)
            pq.add(i);
        while(pq.size()>1)
        {
            int a = pq.poll();
            int b = pq.poll();
            if(a-b > 0)
                pq.add(a-b);
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}