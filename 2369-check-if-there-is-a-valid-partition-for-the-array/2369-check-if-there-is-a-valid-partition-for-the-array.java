class Solution {
    boolean find;
    Map<Integer, Boolean> cache;
    public boolean validPartition(int[] nums) {
        find = false;
        cache = new HashMap<>();
        backTracking(0, nums);
        return find;
    }
    
    private void backTracking(int index, int[] nums) {
        if(nums.length == index) {
            find = true;
        }
        if(find) {
            return;
        }
        if(cache.containsKey(index)) {
            return;
        }

        // case 1
        if(index + 1 < nums.length && nums[index] == nums[index + 1]) {
            backTracking(index + 2, nums);
        }
        //case 2
        if(index + 2 < nums.length && nums[index] == nums[index + 1] && nums[index + 1] == nums[index + 2]) {
            backTracking(index + 3, nums);
        }
        
        //case 3
        if(index + 2 < nums.length && nums[index] == nums[index + 1]  - 1 && nums[index + 1] == nums[index + 2] - 1) {
            backTracking(index + 3, nums);
        }
        cache.put(index, false);
    }

}