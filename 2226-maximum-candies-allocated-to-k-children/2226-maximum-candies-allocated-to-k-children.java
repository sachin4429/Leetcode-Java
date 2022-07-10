class Solution {
    public boolean isvalid(int[] nums, long max, long k)
    {
        long count = 0;
        for(int i : nums)
        {
                count += (i/max);
        }
        return count >= k ? true : false;
    }
    public int maximumCandies(int[] candies, long k) {
        int mx = -1;
        for(int i : candies)
            mx = Math.max(i, mx);
        long left = 1, right = mx, ans = 0;
        while(left <= right)
        {
            long mid = left + (right - left)/2;
            if(isvalid(candies, mid, k))
            {
                ans = mid;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return (int)ans;
    }
}