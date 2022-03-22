class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List <Integer> ll = new ArrayList<Integer>();
        Arrays.sort(nums);
        int presum = 0;
        int postsum = 0;
        for(int x : nums)
            presum += x;
        for(int i=nums.length-1; i>=0; i--)
        {
            postsum += nums[i];
            presum -= nums[i];
            ll.add(nums[i]);
            if(postsum>presum)
                return ll;
        }
        return ll;
    }
}