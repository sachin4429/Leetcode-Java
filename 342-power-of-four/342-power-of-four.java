class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)
            return true;
        int lo = 1, hi = n;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(n == Math.pow(4,mid))
                return true;
            else if(n < Math.pow(4,mid))
                hi = mid-1;
            else
                lo = mid+1;
        }
        return false;
    }
}