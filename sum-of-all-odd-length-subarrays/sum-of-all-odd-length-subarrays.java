class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        for(int i = 1; i<arr.length; i++)
        {
            arr[i]+=arr[i-1];    
        }
        for(int start = 0; start<arr.length; start++)
        {
           for(int end = start; end<arr.length; end+=2)
            {
                if(start!=0)
                {
                    result += arr[end] - (arr[start-1]);
                }
               else
               {
                   result += arr[end];
               }
            } 
        }
        return result;
    }
}