class Solution {
    public int first(int[] nums, int target) {
        int lo =0, hi =nums.length-1, res = -1;
        while(hi>=lo)
        {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target)
                hi = mid-1;
            else if(nums[mid] < target)
                lo = mid+1;
            else
            {
                res = mid;
                hi = mid-1;
            }
                
        }
        return res;
    }
    public int last(int[] nums, int target) {
        int lo =0, hi =nums.length-1, res = -1;
        while(hi>=lo)
        {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > target)
                hi = mid-1;
            else if(nums[mid] < target)
                lo = mid+1;
            else
            {
                res = mid;
                lo = mid+1;
            }
            
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = first(nums, target);
        arr[1] = last(nums, target);
        return arr;
    }
}