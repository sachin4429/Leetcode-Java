class Solution {
    public int search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi)
        {
            int mid  = (hi+lo)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
            {
                lo = mid+1;
            }
            else if(arr[mid] > target)
                hi = mid - 1;
        }
        return -1;
    }
}