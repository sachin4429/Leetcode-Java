class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(nums[0] < 0 && nums [1] < 0)
        {
            if(nums[0]*nums[1] > nums[nums.length-2]*nums[nums.length-3])
            {
                res = nums[0]*nums[1]*nums[nums.length-1];
            }
        }
        if(nums[nums.length-1]<0)
        {
            res = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }
        return res;
    }
}