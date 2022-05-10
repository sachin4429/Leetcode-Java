class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans= new ArrayList<Integer>();
        int c1 = 0, c2 = 0;
        Integer p1 = null, p2 = null;
        for(int i : nums)
        {
            if(p1 != null && p1 == i)
                c1++;
            else if(p2 != null && p2 == i)
                c2++;
            else if(c1 == 0)
            {
                p1 = i;
                c1++;
            }
            else if(c2 == 0)
            {
                p2 = i;
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1 = 0; c2 =0;
        for(int i : nums)
        {
            if(p1!=null && p1 == i)
                c1++;
            else if(p2!=null && p2 == i)
                c2++;
        }
        if(c1>nums.length/3)
            ans.add(p1);
        if(c2>nums.length/3)
            ans.add(p2);
        return ans;
    }
}