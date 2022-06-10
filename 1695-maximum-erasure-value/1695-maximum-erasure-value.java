class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int arrSum[] = new int[n];
        if(n==1)
            return nums[0];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int left = 0, right = 0, res = 0;
        arrSum[0] = nums[0];
        for(int i = 1; i < n; i++)
            arrSum[i] = nums[i] + arrSum[i-1];
        while(right<n)
        {
            if(map.containsKey(nums[right]))
            {
                left = Math.max(left, map.get(nums[right])+1);
            }
            map.put(nums[right],right);
            res = Math.max(res, left == 0 ? arrSum[right] : arrSum[right] - arrSum[left-1]);
            right++;
        }
        return res;
    }
}

