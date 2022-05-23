class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ll = new ArrayList<Integer>();
        int lo = 0, hi = nums.length-1,res = -1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid] > target)
                hi = mid-1;
            else if(nums[mid] < target)
                lo = mid+1;
            else
            {
                res = mid;
                hi = mid-1;
            }
            
        }
        if(res == -1)
            return ll;
        else
        {
            for(int i = res; i<nums.length; i++)
                if(nums[i] == target)
                    ll.add(i);
                else
                    return ll;
        }
        return ll;
    }
}