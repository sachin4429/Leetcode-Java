class Solution {
    public int minDeletions(String s) {
        if(s.length() < 2)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        map.forEach((k,v) -> pq.add(v));
        int count = 0;
        while(pq.size() > 1)
        {
            int prev = pq.poll();
            if(pq.peek() == prev)
            {
                if(prev-1>0)
                    pq.add(prev-1);
                count++;
            }
        }
        return count;
    }
}