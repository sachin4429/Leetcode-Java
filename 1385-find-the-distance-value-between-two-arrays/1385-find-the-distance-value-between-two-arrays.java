class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int res = 0;
        for(int i = 0; i<arr1.length; i++)
        {
            if(notfound(arr2, arr1[i]-d, arr1[i]+d))
            {
                res++;
            }
        }
        return res;
    }
    public boolean notfound(int arr[], int from, int to)
    {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(arr[mid] >= from && arr[mid] <= to)
                return false;
            else if(arr[mid] < from)
                lo = mid+1;
            else
                hi = mid-1;
        }
        return true;
    }
}