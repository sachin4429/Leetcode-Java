class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> err = new ArrayList<Integer>();
        ArrayList<Integer> orr = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++)
        {
            if(i%2==0)
                err.add(nums[i]);
            else
                orr.add(nums[i]);
        }
        Collections.sort(err);
        Collections.sort(orr);
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