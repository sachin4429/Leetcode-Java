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
             
            if(isSufficient(weights,n,mid,days))
            {
                res = mid;
                hi = mid-1;
            }
            else
                lo = mid+1;
        }
        return lo;
    }
    public boolean isSufficient(int[] w, int n, int max, int d){
        int count = 1;
        int l = w[0];
        for(int i = 1; i < n; i++){
            l+=w[i];
            if(l>max){
                count++;
                l = w[i];
                
            }
        }
        if(count>d) return false;
        return true;
    }
    public boolean isvalid(int[] weights, int n, int k, int mx)
    {
        int day = 0;
        int cap = 0;
        for(int i = 0; i<n; i++)
        {
            cap += weights[i];
            if(cap > mx)
            {
                day++;
                cap = weights[i];
            }
            if(cap > k)
                return false;
        }
        return true;
    }
}