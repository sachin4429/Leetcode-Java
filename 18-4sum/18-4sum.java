class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int rem = target-(nums[i]+nums[j]);
                int low = j+1,high = n-1;
                while(low<high){
                    int sum = nums[low]+nums[high];
                    if(sum==rem){
                        List<Integer> innerRes = new ArrayList<Integer>();
                        innerRes.add(nums[i]);
                        innerRes.add(nums[j]);
                        innerRes.add(nums[low]);
                        innerRes.add(nums[high]);
                        if(!res.contains(innerRes)) 
                            res.add(innerRes);
                        low++;
                        high--;
                    }
                    else if(sum>rem) 
                        high--;
                    else 
                        low++;
                }
            }
        }
        return res;
    }
}