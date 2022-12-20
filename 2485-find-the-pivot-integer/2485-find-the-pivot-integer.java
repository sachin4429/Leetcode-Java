class Solution {
    public int pivotInteger(int n) {
        int lo = 1;
        int hi = n;
        int totalsum = sum(n);
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(sum(mid) == totalsum - sum(mid) + mid)
                return mid;
            else if(sum(mid) < totalsum - sum(mid) + mid)
                lo = mid+1;
            else
                hi = mid-1;
        }
        return -1;
    }
    public int sum(int n)
    {
        return (n*(n+1))/2;
    }
}