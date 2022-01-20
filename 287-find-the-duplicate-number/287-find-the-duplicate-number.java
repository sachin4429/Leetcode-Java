public class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int res = -1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}