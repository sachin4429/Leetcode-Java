class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int lo=0,hi=n-1,mid;
        while(lo<=hi)
        {
            mid= lo+(hi-lo)/2;
            if(nums[mid]>=n-mid&&(mid==0||n-mid>nums[mid-1])) 
            {
                return n-mid;
            } 
            else if(nums[mid]<n-mid) 
            {
                lo=mid+1;
            } else hi=mid-1;
        }
        return -1;
    }
}