class Solution {
     int findKRotation(int nums[], int n) {
        // code here
        int lo =0, hi =n-1;
        while(hi>=lo)
        {
            if(nums[lo]<nums[hi]) return lo;
            int mid = lo + (hi-lo)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev])
                return mid;
            if(nums[mid] >= nums[lo])
                lo = mid+1;
            else
                hi = mid-1;
                
        }
        return -1;
    }
     public int bs(int[] nums, int target, int s, int e) {
        int lo =s, hi =e-1;
        while(hi>=lo)
        {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target)
                hi = mid-1;
            else if(nums[mid] < target)
                lo = mid+1;
            else
                return mid;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        
        int ind = findKRotation(nums, nums.length);
            
        if(ind == 0)
            return bs(nums, target, 0, nums.length);
        else
        {
            int ind1 = bs(nums, target, 0, ind);
            int ind2 = bs(nums, target, ind, nums.length);
            if(ind1 == -1 && ind2 ==-1)
                return -1;
            else if(ind1 != -1)
                return ind1;
            else
                return ind2;
        }
        
    }
}