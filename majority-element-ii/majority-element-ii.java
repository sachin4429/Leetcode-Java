class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length/3;
        HashSet<Integer> h = new HashSet<Integer>();
        ArrayList<Integer> ll = new ArrayList<Integer>();
            
        for(int i = 0; i<nums.length; i++)
        {
            int temp = 0;
            for(int j = 0; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                    temp++;
                if(temp>count)
                {
                    //if(!h.contains(nums[i]))
                        h.add(nums[i]);
                    break;
                }
            }
        }
            //System.out.println(h+" **** ");
            for(int x : h)
            {
                ll.add(x);
            }
        return ll;
    }
}