class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int lo = 0, hi = nums.length-1;
        while(lo<hi)
        {
            if(k-nums[lo] == nums[hi])
            {
                count++;
                lo++; hi--;
            }
            else if(k-nums[lo] > nums[hi])
                lo++;
            else
                hi--;
        }
        return count;
    }
}