class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int lo = 1, hi = 100000000, ans = -1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(isvalid(dist, mid, hour))
            {
                ans = mid;
                hi = mid - 1;
            }
            else
            {
                lo = mid + 1;
            }
        }
            return ans;
    }
    public boolean isvalid(int[] dist, int mid, double hour)
    {
        double count = 0;
        for(int i = 0; i<dist.length; i++)
        {
            if(dist[i]%mid == 0 || i == dist.length-1)
                count += dist[i]/(double)mid;
            else
                count += (dist[i]/mid)+1;
        }
        return count<=hour ? true : false;
    }
}