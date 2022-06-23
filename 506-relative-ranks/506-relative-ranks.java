class Solution {
    class pair{
        int index;
        int points;
        pair(int index, int points)
        {
            this.index = index;
            this.points = points;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<pair> q = new PriorityQueue<pair>((a,b)-> b.points-a.points);
        for(int i =0; i<score.length; i++)
            q.add(new pair(i, score[i]));
        String[] str = new String[score.length];
        int i = 1;
        while(!q.isEmpty())
        {
            pair temp = q.poll();
            if(i == 1)
            {
                str[temp.index] = "Gold Medal";
            }
            else if(i == 2)
            {
                str[temp.index] = "Silver Medal";
            }
            else if(i == 3)
            {
                str[temp.index] = "Bronze Medal";
            }
            else
            {
                str[temp.index] = i+"";
            }
            i++;
        }
        return str;
    }
}