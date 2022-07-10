class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = Integer.MAX_VALUE, hi = 1, op, ans = Integer.MAX_VALUE;
        for(int i : time)
        {
            lo = Math.min(lo, i);
            hi = Math.max(hi, i);
        }
        hi*=totalTrips;
        while(lo<=hi)
        {
            long mid = lo + (hi-lo)/2;
            if(isvalid(time, mid, totalTrips))
            {
                ans = mid;
                hi = mid - 1;
            }
            else
                lo = mid + 1;
        }
        return ans;
    }
    public boolean isvalid(int[] time, long mid, int totalTrips)
    {
        long res = 0;
        for(int i : time)
        {
            res += mid/i;
            if( res >= totalTrips)
                return true;
        }
        return false;
    }
}