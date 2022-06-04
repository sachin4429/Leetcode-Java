class Solution {
    public int maxProduct(int[] nums) {
        int cp=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cp=cp*nums[i];
            max=Math.max(max,cp);
            if(cp==0){
                cp=1;
            }
        }
        cp=1;
        for(int i=nums.length-1;i>=0;i--){
            cp=cp*nums[i];
            max=Math.max(max,cp);
            if(cp==0){
                cp=1;
            }
        }
        return max;
    }
}