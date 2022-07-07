class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Integer one  = 1;
        for(int i = 0; i<nums.length; i++)
        {
            if(map.get(nums[i]) == 1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}