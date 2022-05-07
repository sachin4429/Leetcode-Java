class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int min[] = new int[n];
        min[0] = nums[0];
        for(int j = 1; j<n; j++)
        {
            min[j] = Math.min(nums[j],min[j-1]);
        }
        Stack<Integer> s = new Stack<Integer>();
        for(int k = n-1; k>=0; k--)
        {
            if(nums[k] > min[k])
            {
                while(!s.isEmpty() && s.peek()<=min[k])
                    s.pop();
                if(!s.isEmpty() && s.peek()<nums[k])
                    return true;
            }
            s.push(nums[k]);
        }
        return false;
    }
}