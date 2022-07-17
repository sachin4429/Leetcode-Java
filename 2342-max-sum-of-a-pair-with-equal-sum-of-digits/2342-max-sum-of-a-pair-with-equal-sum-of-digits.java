class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length, res = -1;
        for(int i=0; i<n; i++)
        {
            int sum = sod(nums[i]);
            if(!map.containsKey(sum))
                map.put(sum,i);
            else
            {
                res=Math.max(nums[i]+nums[map.get(sum)],res);
                if(nums[i]>nums[map.get(sum)])
                    map.put(sum,i);
            }
        }
        return res;
    }
    public int sod(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}