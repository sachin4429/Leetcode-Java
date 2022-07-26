class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int count = 0;
        int pre[] = intervals[0];
        
        for(int i = 1; i<intervals.length; i++)
        {
            int preEnd = pre[1];
            int curStart = intervals[i][0];
            int curEnd = intervals[i][1];
            
            if(curStart < preEnd)
            {
                if(curEnd <= preEnd)
                    pre = intervals[i];
                
                count++;
            }
            else
            {
                pre = intervals[i];
            }
        }
        return count;
    }
}