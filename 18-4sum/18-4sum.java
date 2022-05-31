class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	Arrays.sort(nums);
	int n = nums.length;
	if(n<4)
		return res;
	for(int i = 0; i<n-3; i++)
	{
		for(int j = i+1; j<n-2; j++)
		{
			int remain = target - nums[i]-nums[j];
			int lo =j+1, hi = n-1;
			while(lo<hi)
			{
				if(nums[lo]+nums[hi] == remain)
				{
					List<Integer> innerres = new ArrayList<Integer>();
					innerres.add(nums[i]);
					innerres.add(nums[j]);
 					innerres.add(nums[lo]);
					innerres.add(nums[hi]);
                    if(!res.contains(innerres))
                        res.add(innerres);
					lo++; hi--;
				}
				else if(nums[lo]+nums[hi] < remain)
				{
					lo++;
				}
				else 
				{
					hi--;
				}
        	}
        }
    }
        return res;
}
}