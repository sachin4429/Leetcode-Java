class Solution {
    public boolean divideArray(int[] nums) {
        int arr[] = new int[501];
        for(int i : nums)
            arr[i]++;
        for(int i : arr)
            if((i&1) == 1)
                return false;
        return true;
    }
}