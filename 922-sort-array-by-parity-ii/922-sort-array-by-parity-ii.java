class Solution {
    public int[] sortArrayByParityII(int[] nums) {
             int j = 1;
        int n = nums.length;
        for (int i = 0; i < n; i += 2) {
            if((nums[i] % 2) == 1) {
                while (j < n && (nums[j] % 2) == 1) {
                    j += 2;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
        
    }
}