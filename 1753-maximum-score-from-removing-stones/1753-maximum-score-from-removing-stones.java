class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((x,y)-> y-x);
        q.add(a); q.add(b); q.add(c);
        int count = 0, score = 0;
        while(true)
        {
            int first = q.poll();
            int second = q.poll();
            if(second == 0)
                break;
            q.add(first-1);
            q.add(second-1);
            score++;
        }
        return score;
    }
}