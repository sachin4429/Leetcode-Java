class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i : nums)
        {
            if(i>0)
                pos.add(i);
            else
                neg.add(i);
        }
        for(int i = 0, j = 0, k = 0; i < nums.length; )
        {
            nums[i++] = pos.get(j++);
            nums[i++] = neg.get(k++);
        }
        return nums;
    }
}