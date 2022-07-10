class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int mx = -1;
        for(int i : nums)
            mx = Math.max(i, mx);
        int left = 1, right = mx, op, ans = Integer.MAX_VALUE;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            op = isvalid(nums, mid);
            if(op <= maxOperations)
            {
                if(mid<ans)
                    ans = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return ans;
    }
    public int isvalid(int[] nums, int max)
    {
        int count = 0;
        for(int i : nums)
        {
            if(i%max == 0)
                count += (i/max)-1;
            else
                count += i/max;
        }
        return count;
    }
}