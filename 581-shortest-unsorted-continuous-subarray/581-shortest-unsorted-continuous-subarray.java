class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[] = new int [nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int low = 0, high = nums.length-1;
        while(low<high)
        {
            if(arr[low] == nums[low])
                low++;
            else if(arr[high] == nums[high])
                high--;
            else
                break;
        }
        if(high == low)
            return 0;
        return high-low+1;
    }
}