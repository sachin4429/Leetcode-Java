class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> b-a);
        for(int i : stones)
            pq.add(i);
        while(pq.size()>=2)
        {
            int a = pq.poll();
            int b = pq.poll();
            if(Math.abs(a-b) > 0)
                pq.add(Math.abs(a-b));
        }
        if(pq.size() == 0)
            return 0;
        else
            return pq.poll();
    }
}