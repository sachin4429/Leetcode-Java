class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length;
        int m = nums2.length;
        int arr[] = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i<n && j<m)
        {
            if(nums1[i] == nums2[j])
            {
                arr[k++] = nums1[i++];
                arr[k++] = nums2[j++];
            }
            else if(nums1[i]<nums2[j])
            {
                arr[k++] = nums1[i++];
            }
            else
            {
                arr[k++] = nums2[j++];
            }
        }
        while(j<m)
        {
            arr[k++] = nums2[j++];
        }
        while(i<n)
        {
            arr[k++] = nums1[i++];
        }
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
        double result = 0.0;
        if((n+m)%2==0)
            result = (double)(arr[(n+m)/2] + arr[(n+m)/2-1]) / 2;
        else 
            result = arr[(n+m)/2];
        return result;
    }
}