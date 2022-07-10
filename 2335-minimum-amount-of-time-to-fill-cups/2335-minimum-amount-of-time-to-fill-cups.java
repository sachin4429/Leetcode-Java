class Solution {
    public int fillCups(int[] amount) {
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        for(int i : amount)
            pq.add(i);
        while(pq.peek() != 0)
        {
            int first = pq.poll();
            int second = pq.poll();
            res += 1;
            first--;
            second--;
            pq.add(second);
            pq.add(first);
        }
        return res;
    }
}