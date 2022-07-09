class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length, res =-1;
        int lo = 0, hi = 0;
        for(int i : weights)
        {
            lo = Math.max(i, lo);
            hi += i;
        }
         while(lo <= hi)
        {
            int mid = lo + (hi-lo)/2;
             
            if(isvalid(weights,n,mid,days))
            {
                res = mid;
                hi = mid-1;
            }
            else
                lo = mid+1;
        }
        return res;
    }
    
    public boolean isvalid(int[] weights, int n, int mx, int k)
    {
        int day = 1;
        int cap = weights[0];
        for(int i = 1; i<n; i++)
        {
            cap += weights[i];
            if(cap > mx)
            {
                day++;
                cap = weights[i];
            }
            if(day > k)
                return false;
        }
        return true;
    }
}