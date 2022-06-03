class Solution {
    public boolean isPerfectSquare(int num) {
        int lo = 1, hi = num;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(Math.pow(mid,2) == num)
                return true;
            else if(Math.pow(mid,2) > num)
                hi = mid-1;
            else
                lo = mid+1;
        }
        return false;
    }
}