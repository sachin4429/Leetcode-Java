class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        int count = 0;
        int mod=(int)Math.pow(10,9)+7;
        for(int i = 0; i<nums.length; i++)
        {
            long rev=rev(nums[i]);
            
            long diff=nums[i]-rev;
            if(map.containsKey(diff)){
                count=(count%mod + map.get(diff)%mod)%mod;
            }
            
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return  count%mod;
    }
    // public long rev(int x)
    // {
    //     StringBuilder sb = new StringBuilder(x+"");
    //     sb.reverse();
    //     while(sb.charAt(0) == 0)
    //         sb.delete(0,1);
    //     return Long.parseLong(sb.toString());
    // }
    private long rev(int num){
        long rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
}