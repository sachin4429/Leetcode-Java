class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i<nums.length; i++)
        {
            //System.out.println((long)nums[i]-rev(nums[i]));
            if(map.containsKey((long)nums[i]-rev(nums[i])))
            {
                map.put((long)nums[i]-rev(nums[i]), map.get((long)nums[i]-rev(nums[i]))+1);
                res = (res%1000000007 +map.get((long)nums[i]-rev(nums[i]))%1000000007)%1000000007;
                //System.out.println(res);
            }
            else
                map.put((long)nums[i]-rev(nums[i]),0);
        }
        int n = nums.length;
        return  res%1000000007;
    }
    public long rev(int x)
    {
        StringBuilder sb = new StringBuilder(x+"");
        sb.reverse();
        while(sb.charAt(0) == 0)
            sb.delete(0,1);
        return Long.parseLong(sb.toString());
    }
}