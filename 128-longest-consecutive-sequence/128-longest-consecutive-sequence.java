class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        
        int max =1;
        int count = 1;
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                if(nums[i] == nums[i -1] + 1 ){
                    count++;
                }
                else{
                    max = Math.max(count, max);
                    count = 1;
                }
            }
        }
        return Math.max(count, max);
    }
}