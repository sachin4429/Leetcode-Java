class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i+=2)
        {
            count+=nums[i];
        }
        int[] newNums=new int[count];
        int start=0;
        for(int a=0;a<nums.length;a=a+2)
        {
            for(int b=0;b<nums[a];b++)
            {
                newNums[start++]=nums[a+1];
            }
        }
        return newNums;
    }
}