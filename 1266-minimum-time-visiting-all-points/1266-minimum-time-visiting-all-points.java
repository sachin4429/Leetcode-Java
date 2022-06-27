class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int pre[] = points[0];
        int ans = 0;
        for(int i = 1; i<points.length; i++)
        {
            int next[] = points[i];
            ans += Math.max(Math.abs(pre[0]-next[0]), Math.abs(pre[1]-next[1]));
            pre = next;
        }
        return ans;
    }
}