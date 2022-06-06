class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int lo = 0, hi = nums.length-1;
        while(lo<hi)
        {
            if(nums[lo] == nums[lo+1])
                lo++;
            else if(nums[hi] == nums[hi-1])
                hi--;
            else
                break;
        }
        if(lo == hi)
            return 0;
        return hi-lo-1;
    }
}