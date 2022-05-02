class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> err = new ArrayList<Integer>();
        ArrayList<Integer> orr = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
                err.add(nums[i]);
            else
                orr.add(nums[i]);
        }
        int e = 0, o = orr.size()-1;
        for(int i = 0; i<nums.length; i++)
        {
            if(i%2 == 0)
            {
                nums[i] = err.get(e);
                e++;
            }
            else
            {
                nums[i] = orr.get(o);
                o--;
            }
        }
        return nums;
        
    }
}