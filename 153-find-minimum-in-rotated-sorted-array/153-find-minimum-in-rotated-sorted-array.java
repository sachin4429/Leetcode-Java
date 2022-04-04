class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
         int lo =0, hi =n-1;
        while(hi>=lo)
        {
            if(nums[lo]<nums[hi]) return nums[lo];
            int mid = lo + (hi-lo)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev])
                return nums[mid];
            if(nums[mid] >= nums[lo])
                lo = mid+1;
            else
                hi = mid-1;
                
        }
        return -1;
    }
}